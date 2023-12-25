package com.foodapp.foodapp.controller;

import com.foodapp.foodapp.model.Food;
import com.foodapp.foodapp.repository.FoodRepository;
import com.foodapp.foodapp.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class FoodController {
    @Autowired
    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;}

    @GetMapping("/foods")
    public List<Food> getAllFoods(){
        return this.foodService.getAllFoods();
    }
    @GetMapping("foods/{id}")
    public Food getFoodById(@PathVariable Long id) {
        return foodService.getFoodById(id);
    }


    @PostMapping("/foods")
    public Food createFood(@RequestBody Food food) {
        return foodService.saveFood(food);
    }


    @PutMapping("/foods/{id}")
    public ResponseEntity<Food> updateFood(@PathVariable(value = "id") Long foodId,@RequestBody Food foodDetails) {
        Food food = foodService.getFoodById(foodId);
        food.setName(foodDetails.getName());
        food.setCookTime(foodDetails.getCookTime());
        food.setDescription(foodDetails.getDescription());
        food.setPrice(foodDetails.getPrice());
        food.setImageUrl(foodDetails.getImageUrl());
        final Food updatedFood= foodService.saveFood(food);
        return ResponseEntity.ok(updatedFood);
    }

    @DeleteMapping("foods/{id}")
    public void deleteFood(@PathVariable Long id) {
        foodService.deleteFood(id);
    }
}
