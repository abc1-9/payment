# The Payment Settlement Engine primarily consists of four core functionalities:

## Account Balance Management
Manages user financial accounts, provides real-time balance queries and updates, and ensures monetary calculation precision using BigDecimal.

## High-Concurrency Payment & Optimistic Locking
Provides the core payment deduction service within a single transaction (@Transactional), utilizing a version-based optimistic locking mechanism to prevent over-drafting (negative balance) and concurrent overwrite issues under high concurrency.

## Idempotent Payment Handling
Prevents duplicate submissions at the payment order layer using an idempotency_key passed from the client, ensuring that a single payment request cannot be executed multiple times.

## Immutable Accounting Ledger
Records an immutable account journal transaction (supporting DEBIT and CREDIT types) upon every successful payment deduction, ensuring that all balance changes are fully traceable and auditable.
