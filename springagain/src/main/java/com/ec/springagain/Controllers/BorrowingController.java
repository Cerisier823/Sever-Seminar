package com.ec.springagain.Controllers;

import com.ec.springagain.models.Borrowing;
import com.ec.springagain.services.BorrowingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/borrowings")
public class BorrowingController {
    @Autowired
    private BorrowingService borrowingService;

    @GetMapping
    public List<Borrowing> getAllBorrowing(){
        return borrowingService.getAllBorrwing();
    }

    @GetMapping("/{id}")
    public Borrowing getBorrowingById(@PathVariable int id){
        return borrowingService.getBorrowingById(id);
    }

    @PostMapping("/{memberid}/{bookid}")
    public void borrow(@PathVariable String memberid, @PathVariable int bookid){
        borrowingService.borrow(memberid, bookid);
    }

    @PutMapping("/{memberid}/{bookid}")
    public void returnBook(@PathVariable String memberid, @PathVariable int bookid){
        borrowingService.returnBook(memberid, bookid);
    }
}
