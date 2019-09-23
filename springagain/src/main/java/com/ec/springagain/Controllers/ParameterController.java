package com.ec.springagain.Controllers;

import com.ec.springagain.models.Member;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/params")
public class ParameterController {

    //query
    //localhost:8080/params/query?query=abcabc&page=2
    @GetMapping("/query")
    public String query(@RequestParam String query, @RequestParam int page){
        return "[Query]" + "\n" +
                "query: " + query + "\n" +
                "page: " + page;
    }

    //path
    // /path/검색어를 입력해주세요/2  //근데 한글은 안됨
    @GetMapping("/path/{query}/{page}")
    public String path(@PathVariable String query, @PathVariable int page){ //@PathVariable 뒤에 ("page")없어두 됨
        return "[Path Variable]" + "\n" +
                "query: " + query + "\n" +
                "page: " + page;
    }

    //body
    @PostMapping("/body")
    public String body(@RequestBody Member member){
        return "[Body]" + "\n" +
                "id: " + member.getId() + "\n" +
                "name: " + member.getName() + "\n" +
                "contacts: " + member.getContacts();
    }
}
