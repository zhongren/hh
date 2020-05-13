package com.example.hh;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "video")
public class HhController extends BaseController{

    private final String prefix="http://122.51.155.21:8082/file/";

    @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultDto getVideo() {
        ParamDto paramDto = getParam();
        String fileName= (String) paramDto.get("fileName");
        String video=prefix+fileName;
        return ResultDto.success(video);
    }

}
