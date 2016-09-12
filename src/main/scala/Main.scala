import java.io.FileOutputStream

import net.sf.dynamicreports.report.builder.DynamicReports._
import net.sf.jasperreports.engine.{JRDataSource, JRField}

object Main extends App {
  val defaultStyle = stl.style()

  report()
    .title(cmp.text("Getting started"))
    .columns(
      col.column("Item", "item", `type`.stringType())
    )
    .setDataSource(new JRDataSource {
      val it = List("foo", "bar", "moo").iterator
      override def next(): Boolean = it.hasNext
      override def getFieldValue(jrField: JRField): AnyRef = it.next()
    })
    .toPdf(new FileOutputStream("target/report.pdf"))
}
