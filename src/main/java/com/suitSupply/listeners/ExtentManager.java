package com.suitSupply.listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    private static ExtentReports extent;

    public static ExtentReports createInstance() {
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extent.html");
        htmlReporter.config().setDocumentTitle("Extent Report Demo");
        htmlReporter.config().setReportName("TestNG Extent Report");

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        return extent;
    }
}
