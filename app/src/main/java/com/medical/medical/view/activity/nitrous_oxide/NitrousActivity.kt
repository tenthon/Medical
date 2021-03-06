package com.medical.medical.view.activity.nitrous_oxide

import android.app.DatePickerDialog
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.github.mikephil.charting.components.Legend
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.medical.medical.R
import com.medical.medical.base.BaseActivity
import com.medical.medical.utils.AxisDateFormatter
import kotlinx.android.synthetic.main.activity_nitrous.*
import kotlinx.android.synthetic.main.activity_oxygen.*
import java.util.*

class NitrousActivity : BaseActivity() {
    private var tanggal: Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nitrous)
        setToolbar("Nitrous Oxide")
        speedMeterNitrous.setSpeed(100F)
        Handler(Looper.getMainLooper()).postDelayed({
            speedMeterNitrous.setSpeed(-30F)
        }, 15000)

        Handler(Looper.getMainLooper()).postDelayed({
            speedMeterNitrous.setSpeed(90F)

        }, 25000)
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)
        tanggal = month + 1
        dateTvNitrous.text = "$day" + " , " + tanggal + " , " + year

        imgPickerNitrous.setOnClickListener {
            val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                // Display Selected date in TextView
                tanggal = month + 1
                dateTvNitrous.text = "$dayOfMonth , $tanggal , $year"
            }, year, month, day)
            dpd.show()

        }


        val oxygenData = ArrayList<Entry>()
        oxygenData.add(Entry(0F, 49F))
        oxygenData.add(Entry(1F, 13F))
        oxygenData.add(Entry(2F, 96F))
        oxygenData.add(Entry(3F, 06F))
        oxygenData.add(Entry(4F, 81F))
        oxygenData.add(Entry(5F, 18F))
        oxygenData.add(Entry(6F, 47F))
        oxygenData.add(Entry(7F, 18F))
        oxygenData.add(Entry(8F, 37F))
        oxygenData.add(Entry(9F, 19F))

        val oxygenSet = LineDataSet(oxygenData, "Oxygen")
        oxygenSet.mode = LineDataSet.Mode.CUBIC_BEZIER
        oxygenSet.color = Color.BLUE
        oxygenSet.circleRadius = 5f
        oxygenSet.setCircleColor(Color.BLUE)

        val legend = lineChartNitrous.legend
        legend.isEnabled = true
        legend.verticalAlignment = Legend.LegendVerticalAlignment.TOP
        legend.horizontalAlignment = Legend.LegendHorizontalAlignment.CENTER
        legend.orientation = Legend.LegendOrientation.HORIZONTAL
        legend.setDrawInside(false)

        lineChartNitrous.description.isEnabled = false
        lineChartNitrous.xAxis.position = XAxis.XAxisPosition.BOTTOM
        lineChartNitrous.data = LineData(oxygenSet)
        lineChartNitrous.animateXY(100, 500)

        var date = ArrayList<String>();
        date.add("01-Apr")
        date.add("02-Apr")
        date.add("03-Apr")
        date.add("04-Apr")
        date.add("05-Apr")
        date.add("06-Apr")
        date.add("07-Apr")
        date.add("08-Apr")
        date.add("09-Apr")
        date.add("10-Apr")

        val dateMonth = AxisDateFormatter(date.toArray(arrayOfNulls<String>(date.size)))
        lineChartNitrous.xAxis?.valueFormatter = dateMonth;

        Handler(Looper.getMainLooper()).postDelayed({
            val oxygenData = ArrayList<Entry>()
            oxygenData.add(Entry(0F, 49F))
            oxygenData.add(Entry(1F, 13F))
            oxygenData.add(Entry(2F, 96F))
            oxygenData.add(Entry(3F, 06F))
            oxygenData.add(Entry(4F, 81F))
            oxygenData.add(Entry(5F, 18F))
            oxygenData.add(Entry(6F, 47F))
            oxygenData.add(Entry(7F, 08F))
            oxygenData.add(Entry(8F, 37F))
            oxygenData.add(Entry(9F, 09F))

            val oxygenSet = LineDataSet(oxygenData, "Oxygen")
            oxygenSet.mode = LineDataSet.Mode.CUBIC_BEZIER
            oxygenSet.color = Color.BLUE
            oxygenSet.circleRadius = 5f
            oxygenSet.setCircleColor(Color.BLUE)

            val legend = lineChartNitrous.legend
            legend.isEnabled = true
            legend.verticalAlignment = Legend.LegendVerticalAlignment.TOP
            legend.horizontalAlignment = Legend.LegendHorizontalAlignment.CENTER
            legend.orientation = Legend.LegendOrientation.HORIZONTAL
            legend.setDrawInside(false)

            lineChartNitrous.description.isEnabled = false
            lineChartNitrous.xAxis.position = XAxis.XAxisPosition.BOTTOM
            lineChartNitrous.data = LineData(oxygenSet)
            lineChartNitrous.animateXY(100, 500)
        }, 15000)

        Handler(Looper.getMainLooper()).postDelayed({
            val oxygenData = ArrayList<Entry>()
            oxygenData.add(Entry(0F, 49F))
            oxygenData.add(Entry(1F, 13F))
            oxygenData.add(Entry(2F, 96F))
            oxygenData.add(Entry(3F, 06F))
            oxygenData.add(Entry(4F, 81F))
            oxygenData.add(Entry(5F, 18F))
            oxygenData.add(Entry(6F, 47F))
            oxygenData.add(Entry(7F, 28F))
            oxygenData.add(Entry(8F, 47F))
            oxygenData.add(Entry(9F, 29F))

            val oxygenSet = LineDataSet(oxygenData, "Oxygen")
            oxygenSet.mode = LineDataSet.Mode.CUBIC_BEZIER
            oxygenSet.color = Color.BLUE
            oxygenSet.circleRadius = 5f
            oxygenSet.setCircleColor(Color.BLUE)

            val legend = lineChartNitrous.legend
            legend.isEnabled = true
            legend.verticalAlignment = Legend.LegendVerticalAlignment.TOP
            legend.horizontalAlignment = Legend.LegendHorizontalAlignment.CENTER
            legend.orientation = Legend.LegendOrientation.HORIZONTAL
            legend.setDrawInside(false)

            lineChartNitrous.description.isEnabled = false
            lineChartNitrous.xAxis.position = XAxis.XAxisPosition.BOTTOM
            lineChartNitrous.data = LineData(oxygenSet)
            lineChartNitrous.animateXY(100, 500)
        }, 25000)
    }
}