package com.klu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class HomeController {

    @GetMapping({"/", "/home", "/status"})
    public String getStatus() {
        // Corrected date
        LocalDate fixedDate = LocalDate.of(2025, 4, 9);  // ✅ day = 9

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = fixedDate.format(formatter);

        return "Task Completed on " + formattedDate + " by Bhavya";
    }
}
