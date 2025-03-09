package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UniversityInfoController {

    @GetMapping("/api/universityInfo")
    public Object getUniversityInfo(@RequestParam(required = false) String university) {
        if (university != null) {
            UniversityInfoProvider.UniversityInfo info = UniversityInfoProvider.getUniversityInfoMap().get(university);
            if (info != null) {
                return info;
            } else {
                return "Δεν βρέθηκαν πληροφορίες για το πανεπιστήμιο: " + university;
            }
        } else {
            return UniversityInfoProvider.getUniversityInfoMap();
        }
    }
}
