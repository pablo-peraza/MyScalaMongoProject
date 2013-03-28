package com.ciriscr.myscalamongoproject

import org.joda.time.DateTime
import com.mongodb.casbah.Imports._

/**
 * Creado por<br/>
 *    Compañía:  Ciris Informatic Solutions<br/>
 *    Web:       www.ciriscr.com<br/>
 *    Usuario:   piousp<br/>
 *    Fecha:     27/03/13<br/>
 *    Hora:      03:59 PM<br/>
 * -----------------------------------------------
 * 
 */
object CRUDTest {
  def main(a: Array[String]): Unit = {
    val item1 = new Item("LED TV", 4000, "im1")
    val item2 = new Item("Dishwasher", 2750, "6t6s")
    val item3 = new Item("Generic Keyboard", 40, "gk_001")
    val invoiceLine1 = new InvoiceLine(1, item1, 4000)
    val invoiceLine2 = new InvoiceLine(2, item2, 3500)
    val invoiceLine3 = new InvoiceLine(10, item3, 400)
    val invoice = new Invoice(1, List(invoiceLine1, invoiceLine2, invoiceLine3), new DateTime(), 7900)
    val dao = new InvoiceDAO()

    dao.insert(invoice)
    val fromDB = dao.findOne(MongoDBObject("number" -> invoice.number)).get
    assert(fromDB == invoice)
    println(fromDB)
  } //def
} //object