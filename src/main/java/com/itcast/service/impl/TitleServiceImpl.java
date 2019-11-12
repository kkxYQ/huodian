package com.itcast.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.itcast.config.Result;
import com.itcast.dao.*;
import com.itcast.entity.*;
import com.itcast.parent.ResultTitle;
import com.itcast.parent.Table;
import com.itcast.service.ITitleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.experimental.PackagePrivate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * <p>
 * 标题表 服务实现类
 * </p>
 *
 * @author huodian
 * @since 2019-11-07
 */
@Service
public class TitleServiceImpl extends ServiceImpl<TitleMapper, Title> implements ITitleService {

    @Autowired
    private TitleMapper titleMapper;
    @Autowired
    private AssociationMapper associationMapper;
    @Autowired
    private OneMapper oneMapper;
    @Autowired
    private TwoMapper twoMapper;
    @Autowired
    private ThreeMapper threeMapper;
    @Autowired
    private FourMapper fourMapper;
    @Autowired
    private FivesMapper fivesMapper;
    @Autowired
    private SixMapper sixMapper;



    @Override
    public Object workOverview() {
        Title title = titleMapper.selectById(1);
        return transfer(title);
    }

    @Override
    public Object Construction(){
        Title title = titleMapper.selectById(2);
        return transfer(title);
    }

    @Override
    public Object WorkBasis(){
        Title title = titleMapper.selectById(3);
        return transfer(title);
    }
    @Override
    public Object Procedures(){
        Title title = titleMapper.selectById(4);
        return transfer(title);
    }

    @Override
    public Object WorkProcessanAndMainResearchContent() {
        Title title = titleMapper.selectById(5);
        return transfer(title);
    }

    @Override
    public Object WorkProcessan() {
        Title title = titleMapper.selectById(6);
        boolean present = Optional.ofNullable(title).isPresent();
        if (present){
            Table table = new Table();
            ResultTitle resultTitle = new ResultTitle();
            resultTitle.setTitle(title.getTitleContent());
            resultTitle.setContent(title.getContent());
            String image = title.getImageAddress();
            if (StringUtils.isNotEmpty(image)){
                String[] split = image.split(",");
                List<String> strings = Arrays.asList(split);
                resultTitle.setImageAddress(strings);
            }
            if (title.getForm()){
                QueryWrapper<Association> ass = new QueryWrapper<>();
                ass.eq("title_id", title.getId());
                List<Association> associations = associationMapper.selectList(ass);
                if (associations.size()>0){
                    QueryWrapper<One> one = new QueryWrapper<>();
                    one.select("time", "contnt", "Completion");
                    List<One> maps = oneMapper.selectList(one);
                    if (maps.size()>0){
                        table.setOneList(maps);
                        resultTitle.setTable(table);
                        return resultTitle;
                    }
                }
            }
        }
        return Result.failure(203,"数据不存在");
    }

    @Override
    public Object MainResearchContent() {
        Title title = titleMapper.selectById(7);
        return transfer(title);
    }

    @Override
    public Object SiteAirCoolingObservatory() {
        Title title = titleMapper.selectById(8);
        return transfer(title);
    }

    @Override
    public Object SiteObservationConstruction() {
        Title title = titleMapper.selectById(9);
        return transfer(title);
    }

    @Override
    public Object InstallationAndQualification() {
        Title title = titleMapper.selectById(10);
        boolean present = Optional.ofNullable(title).isPresent();
        if (present) {
            String titleContent = title.getTitleContent();
            String content = title.getContent();
            String[] split = title.getImageAddress().split(",");
            List<String> strings = Arrays.asList(split);
            if (title.getForm()) {
                QueryWrapper<Association> ass = new QueryWrapper<>();
                ass.eq("title_id", title.getId());
                List<Association> associations = associationMapper.selectList(ass);
                if (associations.size() > 0) {
                    QueryWrapper<Two> two = new QueryWrapper<>();
                    two.select("name", "model", "height","factory");
                    List<Two> maps = twoMapper.selectList(two);
                    if (maps.size() > 0) {
                        ResultTitle resultTitle = new ResultTitle();
                        Table table = new Table();
                        resultTitle.setTitle(titleContent);
                        resultTitle.setContent(content);
                        resultTitle.setImageAddress(strings);
                        table.setTwoList(maps);
                        resultTitle.setTable(table);
                        return resultTitle;
                    }
                }

            }

        }
        return Result.failure(203,"数据不存在");
    }

    @Override
    public Object Observations() {
        Title title = titleMapper.selectById(11);
        return transfer(title);
    }

    @Override
    public Object TetheredAirshipLowAltitudeDetection() {
        Title title = titleMapper.selectById(12);
        return transfer(title);
    }

    @Override
    public Object ObservationInstrument() {
        Title title = titleMapper.selectById(13);
        return transfer(title);
    }

    @Override
    public Object MainSpecifications() {
        Title title = titleMapper.selectById(14);
        return transfer(title);
    }

    @Override
    public Object Radiosonde() {
        Title title = titleMapper.selectById(15);
        boolean present = Optional.ofNullable(title).isPresent();
        if (present) {
            String titleContent = title.getTitleContent();
            String content = title.getContent();
            String[] split = title.getImageAddress().split(",");
            List<String> strings = Arrays.asList(split);
            ResultTitle resultTitle = new ResultTitle();
            resultTitle.setTitle(titleContent);
            resultTitle.setContent(content);
            resultTitle.setImageAddress(strings);
            return resultTitle;
        }
        return Result.failure(203,"数据不存在");
    }

    @Override
    public Object InstrumentVerification() {
        Title title = titleMapper.selectById(16);
        return transfer(title);
    }

    @Override
    public Object WorkProcess() {
        Title title = titleMapper.selectById(17);
        return transfer(title);
    }

    @Override
    public Object ObservationMethodsAndDataQuality() {
        Title title = titleMapper.selectById(18);
        return transfer(title);
    }

    @Override
    public Object ObservationLocation() {
        Title title = titleMapper.selectById(19);
        return transfer(title);
    }

    @Override
    public Object Meteorological() {
        Title title = titleMapper.selectById(20);
        boolean present = Optional.ofNullable(title).isPresent();
        if (present) {
            String titleContent = title.getTitleContent();
            String content = title.getContent();
            String image = title.getImageAddress();
            Table table = new Table();
            ResultTitle resultTitle = new ResultTitle();
            if (StringUtils.isNotEmpty(image)){
                String[] split = image.split(",");
                List<String> strings = Arrays.asList(split);
                resultTitle.setImageAddress(strings);
            }
            if (title.getForm()){
                QueryWrapper<Association> ass = new QueryWrapper<>();
                ass.eq("title_id", title.getId());
                List<Association> associations = associationMapper.selectList(ass);
                if (associations.size() > 0) {
                    resultTitle.setTitle(titleContent);
                    resultTitle.setContent(content);
                    QueryWrapper<Three> thre = new QueryWrapper<>();
                    thre.select("meteorological_element", "reasonable_range");
                    List<Three> threes = threeMapper.selectList(thre);
                    if (threes.size() > 0) {
                        table.setThreeList(threes);
                        resultTitle.setTable(table);
                    }
                    QueryWrapper<Four> four = new QueryWrapper<>();
                    four.select("meteorological_element", "con","reasonable_correlation");
                    List<Four> fours = fourMapper.selectList(four);
                    if (fours.size()>0){
                        table.setFourList(fours);
                        resultTitle.setTable(table);
                    }
                    QueryWrapper<Fives> five = new QueryWrapper<>();
                    five.select("meteorological_element", "reasonable_correlation");
                    List<Fives> fives = fivesMapper.selectList(five);
                    if (fives.size() > 0) {
                        table.setFivesList(fives);
                        resultTitle.setTable(table);
                    }
                    QueryWrapper<Six> six = new QueryWrapper<>();
                    six = six.select("meteorological_element", "reasonable_difference");
                    List<Six> sixs = sixMapper.selectList(six);
                    if (sixs.size()>0){
                        table.setSixList(sixs);
                        resultTitle.setTable(table);
                    }
                    return resultTitle;
                }

            }
        }
        return Result.failure(203,"数据不存在");
    }


    public Object transfer(Title title){
        boolean present = Optional.ofNullable(title).isPresent();
        if (present) {
            ResultTitle resultTitle = new ResultTitle();
            String titleContent = title.getTitleContent();
            String content = title.getContent();
            String image=title.getImageAddress();
            if (StringUtils.isNotEmpty(image)){
                String[] split = image.split(",");
                resultTitle.setImageAddress(Arrays.asList(split));
            }
            resultTitle.setTitle(titleContent);
            resultTitle.setContent(content);
            return resultTitle;
        }
        return Result.failure(203,"数据不存在");
    }
}
