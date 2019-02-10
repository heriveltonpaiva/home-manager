package br.com.home.controller;

import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author hpaiva
 * @version $Revision: $<br/>
 * $Id: $
 * @since 10/02/19 15:41
 */
@RestController
@RequestMapping("/home-manager")
public class HomeManagerController {

    @GetMapping
    @ReadOperation
    public String index(){
        return "home";
    }

}
