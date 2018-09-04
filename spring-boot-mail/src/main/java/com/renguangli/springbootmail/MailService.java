package com.renguangli.springbootmail;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * MailService
 *
 * @author renguangli 2018/8/29 17:16
 * @since JDK 1.8
 */
public interface MailService {

    Page<Mail> listMail(Pageable pageable, Mail mail);

    Mail sendSimpleMail(Mail mail);

    boolean sendAndSave(Mail mail);

}
