package com.ciriscr.myscalamongoproject

import org.joda.time.DateTime

/**
 * Creado por<br/>
 *    Compañía:  Ciris Informatic Solutions<br/>
 *    Web:       www.ciriscr.com<br/>
 *    Usuario:   piousp<br/>
 *    Fecha:     27/03/13<br/>
 *    Hora:      11:01 AM<br/>
 * -----------------------------------------------
 * 
 */
case class Item(name: String, price: Double, code: String)

case class InvoiceLine(quantity: Int, item: Item, total: Double){
  //def total: Double = quantity * item.price
} //class

case class Invoice(number: Int, lines: List[InvoiceLine], date: DateTime, total: Double){
  //def total: Double = (0.0 /: lines)(_ + _.total)
}