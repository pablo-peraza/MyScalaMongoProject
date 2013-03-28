package com.ciriscr.myscalamongoproject

import com.mongodb.casbah.commons.conversions.scala.RegisterJodaTimeConversionHelpers
import com.mongodb.casbah.Imports._

/**
 * Creado por<br/>
 *    Compañía:  Ciris Informatic Solutions<br/>
 *    Web:       www.ciriscr.com<br/>
 *    Usuario:   piousp<br/>
 *    Fecha:     27/03/13<br/>
 *    Hora:      09:29 AM<br/>
 * -----------------------------------------------
 * 
 */
object MongoConnectionManager {
  RegisterJodaTimeConversionHelpers()  //JodaTime hooks for casbah

  lazy val connection = establishConnection("localhost", 27017, "test")

  def collection(name: String): MongoCollection = connection(name)

  /**
   * Establish a connection to a particular database on host:port.
   * @param host String
   * @param port Int
   * @param database Name of the database to connect
   * @return MongoDB
   */
  private def establishConnection(host: String,
                                  port: Int,
                                  database: String ): MongoDB = MongoConnection(host, port)(database)
} //object