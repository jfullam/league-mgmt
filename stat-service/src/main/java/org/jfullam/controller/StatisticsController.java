package org.jfullam.controller;

import org.jfullam.domain.Statistic;
import org.jfullam.domain.StatisticCollection;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jfullam on 9/5/16.
 */
@RestController
public class StatisticsController {

   @RequestMapping("/person/{personId}")
    public StatisticCollection getPlayerStatistics(Long personId) {
       StatisticCollection stats = new StatisticCollection("Jonathan Fullam");
       List<Statistic> statsList = new ArrayList<Statistic>();

       statsList.add(new Statistic("AVG", ".238"));
       statsList.add(new Statistic("HITS", "56"));
       statsList.add(new Statistic("SO", "10"));
       statsList.add(new Statistic("AB", "235 "));
       statsList.add(new Statistic("SLG", ".325"));
       statsList.add(new Statistic("BB", "12"));
       statsList.add(new Statistic("OBP", ".275"));

       stats.setStatistics(statsList);
       return stats;
   }

}
