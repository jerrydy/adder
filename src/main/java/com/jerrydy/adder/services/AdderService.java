package com.jerrydy.adder.services;

import org.springframework.stereotype.Service;

/**
 * Created by Jerry on 12/27/2015.
 */
@Service
public class AdderService {
    public Long add(Long addend1, Long addend2) {
        return addend1 + addend2;
    }
}
