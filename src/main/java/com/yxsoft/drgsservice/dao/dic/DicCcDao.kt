package com.yxsoft.drgsservice.dao.dic

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.yxsoft.drgsservice.entity.dic.TDicCc
import com.yxsoft.drgsservice.entity.dic.TDicRemoveList

interface DicCcDao : BaseMapper<TDicCc> {
    fun ShowRemoveGroup(ccId: Long?): List<TDicRemoveList>?
}
