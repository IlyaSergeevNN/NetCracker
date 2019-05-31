package com.netcracker;

import com.netcracker.config.SpringConfig;
import com.netcracker.model.*;
import com.netcracker.service.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import javax.persistence.EntityManager;

public class Main{

    static EntityManager em;

    public static void main(String[] args) {


        AbstractApplicationContext context =
                 new AnnotationConfigApplicationContext(SpringConfig.class);


        BuyersService buyersService = (BuyersService) context.getBean("buyersService");
        //buyersService.saveBuyer(new Buyer("Ivanov", "Sovetsky", 10 ));

        //System.out.println(buyersService.findAllBuyers());
        //buyersService.deleteBuyerById(1);

        BookService bookService = (BookService) context.getBean("bookService");
        //bookService.saveBook(new Book("Bible", 100.99, "Moscow", 4));

        ShopService shopService = (ShopService) context.getBean("shopService");
        //shopService.saveShop(new Shop("Berezka", "Perm", 5));

        Buyer buyer = new Buyer("Sidorov", "Sovetsky", 11);
        Book book1 = new Book("Mu-mu", 10.99, "Kanavino", 5);
        Shop shop = new Shop("Kniga", "Sormovo", 15);

//        buyersService.saveBuyer(buyer);
//        bookService.saveBook(book1);
//        shopService.saveShop(shop);

        BuyService buyService = (BuyService) context.getBean("buyService");
        //buyService.saveBuy(new Buy(new java.sql.Date(2019 - 1900,4,29), shop, buyer, book1, 2));

        QueryService queryService = (QueryService) context.getBean("queryService");
        queryService.queryBooks();
        queryService.queryDistricts();
        queryService.queryBuyers();
        queryService.queryShops();
        queryService.queryBookNamesAanPrice();





    }
}
