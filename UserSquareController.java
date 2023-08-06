package com.square.winner.squarewinner.controller;

import com.square.winner.squarewinner.model.SquareDetail;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/user/{userId}")
public class UserSquareController {



    @GetMapping("/squares")
    public List<SquareDetail> getSquares(@PathVariable Long userId) {
        return null;
    }
}
