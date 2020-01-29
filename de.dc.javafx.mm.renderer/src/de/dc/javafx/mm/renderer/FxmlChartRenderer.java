package de.dc.javafx.mm.renderer;

import de.dc.javafx.mm.EAreaChart;
import de.dc.javafx.mm.EBarChart;
import de.dc.javafx.mm.EBubbleChart;
import de.dc.javafx.mm.EChart;
import de.dc.javafx.mm.ELineChart;
import de.dc.javafx.mm.EPieChart;
import de.dc.javafx.mm.EScatterChart;
import de.dc.javafx.mm.EStackedAreaChart;
import de.dc.javafx.mm.EStackedBarChart;
import javafx.scene.Node;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.BubbleChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.StackedAreaChart;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;

public class FxmlChartRenderer extends FxmlRenderer {

	@Override
	public Node caseEPieChart(EPieChart object) {
		PieChart node = new PieChart();
		initSize(object, node);
		return node;
	}

	@Override
	public Node caseEAreaChart(EAreaChart object) {
		return createChart(object);
	}

	@Override
	public Node caseEScatterChart(EScatterChart object) {
		return createChart(object);
	}

	@Override
	public Node caseEStackedBarChart(EStackedBarChart object) {
		return createChart(object);
	}

	@Override
	public Node caseEBarChart(EBarChart object) {
		return createChart(object);
	}
	
	@Override
	public Node caseELineChart(ELineChart object) {
		return createChart(object);
	}
	
	protected XYChart<Number, Number> createChart(EChart object){
		NumberAxis xAxis = new NumberAxis();
		NumberAxis yAxis = new NumberAxis();
		XYChart<Number, Number> node = null;
		if (object instanceof ELineChart) {
			node = new LineChart<>(xAxis, yAxis);
		}else if (object instanceof EBarChart) {
			node = new BarChart<>(xAxis, yAxis);
		}else if (object instanceof EScatterChart) {
			node = new ScatterChart<>(xAxis, yAxis);
		}else if (object instanceof EAreaChart) {
			node = new AreaChart<>(xAxis, yAxis);
		}else if (object instanceof EBubbleChart) {
			node = new BubbleChart<>(xAxis, yAxis);
		}else if (object instanceof EStackedAreaChart) {
			node = new StackedAreaChart<>(xAxis, yAxis);
		}else if (object instanceof EStackedBarChart) {
			node = new StackedBarChart<>(xAxis, yAxis);
		}
		initSize(object, node);
		return node;
	}
}