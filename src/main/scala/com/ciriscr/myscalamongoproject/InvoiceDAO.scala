package com.ciriscr.myscalamongoproject

import com.novus.salat.dao.SalatDAO
import com.novus.salat._
import com.novus.salat.global.ctx
import com.mongodb.casbah.Imports._

/**
 * Creado por<br/>
 *    Compañía:  Ciris Informatic Solutions<br/>
 *    Web:       www.ciriscr.com<br/>
 *    Usuario:   piousp<br/>
 *    Fecha:     27/03/13<br/>
 *    Hora:      11:58 AM<br/>
 * -----------------------------------------------
 * 
 */
class InvoiceDAO extends SalatDAO[Invoice, ObjectId](MongoConnectionManager.collection("Invoices"))