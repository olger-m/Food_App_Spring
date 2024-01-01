package com.foodapp.foodapp.controller;

import com.foodapp.foodapp.model.Role;
import com.foodapp.foodapp.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/roles")
    public List<Role> getAllRoles() {
        return roleService.getAllRoles();
    }

    @GetMapping("/roles/{id}")
    public ResponseEntity<Role> getRoleById(@PathVariable(value = "id") Long roleId) {
        Role role = roleService.findById(roleId);
        return ResponseEntity.ok().body(role);
    }

    @PostMapping("/roles")
    public Role createRole(@RequestBody Role role) {
        return roleService.saveRole(role);
    }

    @DeleteMapping("/roles/{id}")
    public void deleteRole(@PathVariable(value = "id") Long roleId) {
        roleService.deleteRole(roleId);
    }


}
