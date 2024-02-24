
package com.ilyes.buildanadaptiveappwithdynamicnavigation.ui

import com.ilyes.buildanadaptiveappwithdynamicnavigation.data.Email
import com.ilyes.buildanadaptiveappwithdynamicnavigation.data.MailboxType
import com.ilyes.buildanadaptiveappwithdynamicnavigation.data.local.LocalEmailsDataProvider


data class ReplyUiState(
    val mailboxes: Map<MailboxType, List<Email>> = emptyMap(),
    val currentMailbox: MailboxType = MailboxType.Inbox,
    val currentSelectedEmail: Email = LocalEmailsDataProvider.defaultEmail,
    val isShowingHomepage: Boolean = true
) {
    val currentMailboxEmails: List<Email> by lazy { mailboxes[currentMailbox]!! }
}
