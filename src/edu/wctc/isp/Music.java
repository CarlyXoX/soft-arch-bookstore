package edu.wctc.isp;

import java.time.Duration;
import java.time.LocalDate;

public interface Product extends Product {
    String getArtist();
    Duration getPlayingTime();
}