package com.fintech.payment.service.impl;

import com.fintech.payment.entity.TransactionRecord;
import com.fintech.payment.mapper.TransactionRecordMapper;
import com.fintech.payment.service.ITransactionRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * Transaction Record Statement Table
 * </p>
 *
 * @author Liping Wang
 * @since 2026-09-21
 */
@Service
public class TransactionRecordServiceImpl extends ServiceImpl<TransactionRecordMapper, TransactionRecord> implements ITransactionRecordService {

}
