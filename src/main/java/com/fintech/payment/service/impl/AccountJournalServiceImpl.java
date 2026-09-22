package com.fintech.payment.service.impl;

import com.fintech.payment.entity.AccountJournal;
import com.fintech.payment.mapper.AccountJournalMapper;
import com.fintech.payment.service.IAccountJournalService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * Account Journal Statement Table
 * </p>
 *
 * @author Liping Wang
 * @since 2026-09-22
 */
@Service
public class AccountJournalServiceImpl extends ServiceImpl<AccountJournalMapper, AccountJournal> implements IAccountJournalService {

}
