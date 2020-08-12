package com.example.assignment.service;


import com.example.assignment.domain.WeatherInfo;
import com.example.assignment.dto.ResponseDto;
import com.example.assignment.repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    WeatherRepository weatherRepository;


    private static final String apiKey = "6b8071a9da36c10080f524718d3d1da9";

    private static final String WEATHER_URL =
            "http://api.openweathermap.org/data/2.5/weather";

    public ResponseDto getForecast(String city) {
          ResponseDto responseDto = ResponseDto.builder ().status ( false ).message ("weather forecast api call failed").build ();
          String cityVal = "q=" + city;
          String appid = "&apikey=" + apiKey;
          String url = WEATHER_URL + "?" + cityVal + appid ;
          WeatherInfo weather = restTemplate.getForEntity(url, WeatherInfo.class).getBody();
          Long id = weatherRepository.save ( weather ).getId ();
          responseDto.setStatus ( true );
          responseDto.setMessage ( "Data stored in database" );
          responseDto.setData ( "id="+id );
          return responseDto;
        }

}
