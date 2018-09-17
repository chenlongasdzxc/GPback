package com.zps.gradproject.service.Impl;

import com.zps.gradproject.pojo.Commes;
import com.zps.gradproject.pojo.Merchant;
import com.zps.gradproject.repository.MerChantRepository;
import com.zps.gradproject.service.MerChantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author Zps
 * @date 2018/8/31 16:35
 **/
@Service
public class MerChantServiceImpl implements MerChantService {

    @Autowired
    private MerChantRepository merChantRepository;

    @Override
    public Commes findByCode(String code) {
            Merchant merchant = merChantRepository.findByCodeAndDeletedIsFalse(code);
            if (merchant.getCode()!=null) {
                return Commes.successMes();
            }else {
                return Commes.innerError("数据不存在");
            }
    }

    @Override
    public Commes update(Merchant merchant) {
        Merchant merchant1=merChantRepository.findByCodeAndDeletedIsFalse(merchant.getCode());
        if (Objects.equals(merchant1.getCode(), merchant.getCode())) {
            merchant1.setAddress(merchant.getAddress());
            merchant1.setEmail(merchant.getEmail());
            merchant1.setRegistPersonName(merchant.getRegistPersonName());
            return Commes.success(merChantRepository.save(merchant1));
        } else {
            return Commes.innerError("数据不存在");
        }
    }

    @Override
    public Commes<Merchant> delete(String id) {
       try {
           Merchant merchant = merChantRepository.findById(id);
           merchant.setDeleted(true);
           return Commes.successMes();
       }catch (Exception e){
           e.printStackTrace();
           return Commes.errorMes("400","数据不存在");
       }

    }
}
