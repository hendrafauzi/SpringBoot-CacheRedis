package com.hendra.cache.service;

import com.hendra.cache.model.CustomerInfo;
import com.hendra.cache.model.PaymentAccount;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class PaymentService
{
    private List<PaymentAccount> accountList;

    @PostConstruct
    public void init()
    {
        accountList = new ArrayList<>();
        accountList.add(new PaymentAccount("1",new CustomerInfo("081110119202", "hendra", "fauzi",
                "hendra@f.com", "21-01-1990", "15071", "Jakarta", "Bandung Selatan"), 30000, new Date()));
        accountList.add(new PaymentAccount("2",new CustomerInfo("089281923812", "iffan", "majid",
                "iffan@f.com", "01-01-1980", "2421", "Tambun", "Selat Sunda"), 40500, new Date()));
        accountList.add(new PaymentAccount("3",new CustomerInfo("081311110023", "naya", "sunda",
                "naya@f.com", "26-03-2005", "11231", "Bantar", "Balidong"), 25990, new Date()));
        accountList.add(new PaymentAccount("4",new CustomerInfo("081310006254", "bambang", "Sitompul",
                "bams@f.com", "10-12-1985", "314521", "Prank", "Flamboyan"), 32012, new Date()));
        accountList.add(new PaymentAccount("5",new CustomerInfo("081101023191", "sulia", "papapa",
                "sulia@f.com", "06-11-1990", "12314", "bandung", "bekasi"), 13123, new Date()));
        accountList.add(new PaymentAccount("6",new CustomerInfo("0813123141231", "fooana", "oaoaoa",
                "fooana@f.com", "01-01-1991", "15071", "kambodia", "taiwan Selatan"), 29191, new Date()));
    }

    public List<PaymentAccount> getAccountList()
    {
        try
        {
            TimeUnit.SECONDS.sleep(5);
        }
        catch (InterruptedException IE)
        {
            IE.printStackTrace();
        }

        return accountList;
    }
}