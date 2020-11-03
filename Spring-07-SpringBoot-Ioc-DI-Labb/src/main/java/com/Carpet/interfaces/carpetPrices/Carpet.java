package com.Carpet.interfaces.carpetPrices;
import com.Carpet.enums.City;

import java.math.BigDecimal;

public interface Carpet {

    BigDecimal getSqFtPrice(City city);
}
