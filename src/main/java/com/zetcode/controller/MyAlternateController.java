package com.zetcode.controller;

import com.zetcode.model.Car;
import com.zetcode.model.City;
import com.zetcode.service.ICityService;
import com.zetcode.service.ICarService;
import com.zetcode.service.ILinkService;
import org.apache.tomcat.util.log.SystemLogHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class MyAlternateController {
    @Autowired
    private ICityService cityService;
    @Autowired
    private ICarService carService;
    @Autowired
    private ILinkService linkService;

    @GetMapping(value = "/submission")
    @ResponseBody
    public void handleSubmission(@RequestParam(value = "mlink", defaultValue = "") String mlink) {
        System.out.println("handling submission with link " + mlink);
        linkService.addLink(mlink);
    }

    @GetMapping(value = "/viewlinks")
    @ResponseBody
    public String viewLinks() {
        String ret = "";
        List<String> links = linkService.getLinks();
        for (String s : links) {
            ret += s;
            ret += "\n";
        }
        return ret;
    }

    @GetMapping(value = "/viewlinksalt")
    @ResponseBody
    public String viewLinksalt() {
        String ret = "";
        List<String> links = linkService.getLinks();
        for (String s : links) {
            ret += s;
            ret += ";";
            ret += "\n";
            ret += "\n";
        }
        return ret;
    }

    @GetMapping(value = "/index")
    public String getIndex() {
        return "index.html";
    }

    @GetMapping(value = "/second")
    public String getSecondNew(@RequestParam(value = "mlink", defaultValue = "") String mlink) {
        System.out.println("handling submission with link " + mlink);
        linkService.addLink(mlink);
        return "second.html";
    }

//    @GetMapping(value = "/second")
//    public String getSecond() {
//        return "second.html";
//    }

    @GetMapping(value = "/cities")
    @ResponseBody
    public List<City> getAlternateCities() {
        System.out.println("Alternate");
        List<City> cities = cityService.findAll();

        return cities;
    }

    @GetMapping(value = "/cars")
    @ResponseBody
    public List<Car> getAlternateCars() {
        System.out.println("Alternate method 2");
        List<Car> cars = carService.getAll();
        System.out.println("After get all");
        return cars;
    }
}
