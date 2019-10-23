package ruslan.zhezlo.worksstatistic.controller;


import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
public class TetController {

    @RequestMapping ("/ads")
    public String hello(){
       return "Hello";
   }

    @GetMapping("/aa")
    public String hello(String name, int age){
        return "Hello" + " " + name + age;
    }

    @GetMapping("/aaa")
    public String hello1(){
        return "Hello" + new Random().nextDouble();
    }

    @GetMapping("/prostocikavo/{imya}")
    public String abraCadabra (@PathVariable String imya){
        return imya;
    }

    @PostMapping("/aaa{num}")
    public  String post(@RequestBody LoginDto loginDto,
                        @RequestParam String param,
                        @PathVariable Integer num
    ) {
        return "Works!!!" + param + "!" + num + loginDto;
    }


}
