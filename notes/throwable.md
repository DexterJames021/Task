Object
└── Throwable
    ├── Exception  ← (Checked Exceptions)
    │   ├── IOException
    │   │   ├── FileNotFoundException
    │   │   ├── EOFException
    │   │   ├── InterruptedIOException
    │   │   └── UnknownHostException
    │   ├── SQLException
    │   ├── ClassNotFoundException
    │   ├── CloneNotSupportedException
    │   ├── InstantiationException
    │   ├── InvocationTargetException
    │   ├── NoSuchMethodException
    │   ├── ParseException
    │   ├── TimeoutException
    │   └── InterruptedException
    ├── RuntimeException  ← (Unchecked Exceptions)
    │   ├── ArithmeticException
    │   ├── ArrayIndexOutOfBoundsException
    │   │   └── IndexOutOfBoundsException
    │   ├── ArrayStoreException
    │   ├── ClassCastException
    │   ├── IllegalArgumentException
    │   │   └── NumberFormatException
    │   ├── IllegalStateException
    │   ├── NullPointerException
    │   ├── SecurityException
    │   ├── UnsupportedOperationException
    │   ├── StringIndexOutOfBoundsException
    │   └── ConcurrentModificationException
    └── Error  ← (Serious errors from JVM, not meant to be caught)
        ├── OutOfMemoryError
        ├── StackOverflowError
        ├── VirtualMachineError
        │   ├── InternalError
        │   └── UnknownError
        ├── NoClassDefFoundError
        ├── AssertionError
        ├── ExceptionInInitializerError
        ├── LinkageError
        │   ├── ClassCircularityError
        │   ├── ClassFormatError
        │   ├── IllegalAccessError
        │   ├── IncompatibleClassChangeError
        │   │   ├── AbstractMethodError
        │   │   ├── IllegalAccessError
        │   │   └── NoSuchMethodError
        │   └── VerifyError
