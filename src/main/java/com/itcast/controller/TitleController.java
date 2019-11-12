package com.itcast.controller;


import com.itcast.dao.TitleMapper;
import com.itcast.entity.One;
import com.itcast.parent.ResultTitle;
import com.itcast.service.ITitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 标题表 前端控制器
 * </p>
 *
 * @author huodian
 * @since 2019-11-07
 */
@RestController
@RequestMapping("/title")
public class TitleController {

    @Autowired
    private ITitleService titleService;

    @RequestMapping("/work")
    public Object workOverview(){
        return titleService.workOverview();
    }
    @RequestMapping("/con")
    public Object Construction(){
        return titleService.Construction();
    }
    @RequestMapping("/wokeBase")
    public Object WorkBasis(){
        return titleService.WorkBasis();
    }
    @RequestMapping("/pro")
    public Object Procedures(){
        return titleService.Procedures();
    }
    @RequestMapping("/wokrPro")
    public Object WorkProcessanAndMainResearchContent(){
        return titleService.WorkProcessanAndMainResearchContent();
    }
    @RequestMapping("/wokeProce")
    public Object WorkProcessan(){
        return titleService.WorkProcessan();
    }
    @RequestMapping("/main")
    public Object MainResearchContent(){
        return titleService.MainResearchContent();
    }
    @RequestMapping("/siteAir")
    public Object SiteAirCoolingObservatory(){
        return titleService.SiteAirCoolingObservatory();
    }
    @RequestMapping("/siteObsetvation")
    public Object SiteObservationConstruction(){
        return titleService.SiteObservationConstruction();
    }
    @RequestMapping("/inst")
    public Object InstallationAndQualification(){
        return titleService.InstallationAndQualification();
    }
    @RequestMapping("/observations")
    public Object Observations(){
        return titleService.Observations();
    }
    @RequestMapping("/tethered")
    public Object TetheredAirshipLowAltitudeDetection(){
        return titleService.TetheredAirshipLowAltitudeDetection();
    }
    @RequestMapping("/Observation")
    public Object ObservationInstrument(){
        return titleService.ObservationInstrument();
    }
    @RequestMapping("/mainspecif")
    public Object MainSpecifications(){
        return titleService.MainSpecifications();
    }
    @RequestMapping("/radi")
    public Object Radiosonde(){
        return titleService.Radiosonde();
    }
    @RequestMapping("/instrument")
    public Object InstrumentVerification() {
        return titleService.InstrumentVerification();
    }
    @RequestMapping("/workProcess")
    public Object WorkProcess() {
        return titleService.WorkProcess();
    }
    @RequestMapping("/observationm")
    public Object ObservationMethodsAndDataQuality(){
        return titleService.ObservationMethodsAndDataQuality();
    }
    @RequestMapping("/Observationl")
    public Object ObservationLocation() {
        return titleService.ObservationLocation();
    }
    @RequestMapping("/mete")
    public Object Meteorological() {
        return titleService.Meteorological();
    }

}
