package at.fhtw.slm.uptimecalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UptimeController {
    @GetMapping("/uptime/minutes")
    public double calculateUptimeMinutes(@RequestParam double relative) {
        double minutesOfMonth = 60*24*30;
        double definedUptimeInPercent = relative / 100;
        return minutesOfMonth * definedUptimeInPercent; // uptime in minutes
    }

    @GetMapping("/uptime/hours")
    public double claculateUptimeHours(@RequestParam double relative) {
        double hoursOfMonth = 24*30;
        double definedUptimeInPercent = relative / 100;
        return hoursOfMonth * definedUptimeInPercent; // uptime in hours
    }
}
