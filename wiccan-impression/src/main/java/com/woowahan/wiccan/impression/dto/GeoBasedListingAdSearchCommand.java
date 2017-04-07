package com.woowahan.wiccan.impression.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by justicehoop on 2017. 4. 7..
 */
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
@Data
public class GeoBasedListingAdSearchCommand {
    private Location location;
}
