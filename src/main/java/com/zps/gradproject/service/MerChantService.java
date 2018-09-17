package com.zps.gradproject.service;

import com.zps.gradproject.pojo.Commes;
import com.zps.gradproject.pojo.Merchant;

/**
 * @author Zps
 * @date 2018/8/31 16:34
 **/
public interface MerChantService {

    Commes<Merchant> update(Merchant merchant);

    Commes<Merchant> findByCode(String code);

    Commes<Merchant> delete(String id);
}
