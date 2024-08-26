package com.libreria.controller;

import com.libreria.model.Wishlist;
import com.libreria.service.WishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/wishlists")
public class WishlistController {

    @Autowired
    private WishlistService wishlistService;

    @GetMapping
    public List<Wishlist> getAllWishlists() {
        return wishlistService.getAllWishlists();
    }

    @GetMapping("/{id}")
    public Wishlist getWishlistById(@PathVariable int id) {
        return wishlistService.getWishlistById(id);
    }

    @PostMapping
    public Wishlist createWishlist(@RequestBody Wishlist wishlist) {
        return wishlistService.saveWishlist(wishlist);
    }

    @DeleteMapping("/{id}")
    public void deleteWishlist(@PathVariable int id) {
        wishlistService.deleteWishlist(id);
    }
}
