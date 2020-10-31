package com.resumers.server.oauth.model.dto;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by sehajyang
 * DateTime : 2020/10/31
 */

@JsonSerialize
public class EmptyObject {
    public static EmptyObject OBJECT = new EmptyObject();
    public static List LIST = new ArrayList();
}

