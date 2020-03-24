package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {

        //Given
        Invoice invoice = new Invoice("123456789");

        Product product1 = new Product("Motherboard");
        Product product2 = new Product("Processor");
        Product product3 = new Product("RAM");

        Item item1 = new Item(product1, new BigDecimal(10), 1);
        Item item2 = new Item(product2, new BigDecimal(20), 2);
        Item item3 = new Item(product3, new BigDecimal(30), 3);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);

        invoice.setItems(items);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        int itemSize = invoice.getItems().size();

        Invoice invoiceReadFromDB = invoiceDao.findById(invoiceId);

        //Then
        Assert.assertEquals(3, itemSize);
        Assert.assertEquals(invoiceId, invoiceReadFromDB.getId());
        Assert.assertEquals(itemSize, invoiceReadFromDB.getItems().size());

        //CleanUp
        invoiceDao.delete(invoice);
    }
}