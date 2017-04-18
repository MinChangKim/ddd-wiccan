package com.woowahan.wiccan.management.entity.rule.period;

import lombok.Getter;

import java.util.Date;

/**
 * Created by justicehoop on 2017. 4. 18..
 */
@Getter
public class AdPeriod {
    private Date startDate;
    private Date endDate;

    public static AdPeriod of(Date startDate, Date endDate) {
        AdPeriod period = new AdPeriod();
        period.startDate = startDate;
        period.endDate = endDate;
        return period;
    }
}
