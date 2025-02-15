### **آموزش مقدماتی کاتلین – جلسه اول** 🚀  
**مقدماتی برای دانشجویان تازه‌کار**  

به اولین جلسه آموزش برنامه‌نویسی کاتلین خوش آمدید! 🎉 در این جلسه، با مفاهیم ابتدایی برنامه‌نویسی، کاتلین، و نحوه نوشتن اولین برنامه آشنا خواهیم شد.  

---

## **۱. برنامه‌نویسی چیست؟ 🤔**  
برنامه‌نویسی یعنی نوشتن دستوراتی که کامپیوتر آن‌ها را اجرا کند. با برنامه‌نویسی می‌توانیم نرم‌افزارها، بازی‌ها، و اپلیکیشن‌های مختلفی ایجاد کنیم.  

### **چرا کاتلین؟**  
کاتلین یک زبان مدرن و رسمی برای توسعه اندروید است که ویژگی‌های زیر را دارد:  
✅ ساده، خوانا و مختصر  
✅ ایمن در برابر خطاهای رایج  
✅ قابلیت اجرا روی JVM و اندروید  
✅ پشتیبانی قوی از شی‌گرایی و توابع  

---

## **۲. نصب ابزارهای مورد نیاز 🛠️**  
برای شروع کدنویسی با کاتلین، می‌توان از یکی از روش‌های زیر استفاده کرد:  
1. **Android Studio**: برای برنامه‌نویسی اندروید استفاده می‌شود.  
2. **Kotlin Playground** (آنلاین): اجرای سریع کدهای کاتلین در مرورگر → [play.kotlinlang.org](https://play.kotlinlang.org)  

---

## **۳. اولین برنامه: Hello, World! 🌍**  
برای نوشتن اولین برنامه، کافی است کد زیر را اجرا کنید:  

```kotlin
fun main() {
    println("Hello, World!")
}
```  
🔹 `fun main()` → تابع اصلی که هنگام اجرای برنامه اجرا می‌شود.  
🔹 `println()` → برای چاپ متن در خروجی استفاده می‌شود.  

✏️ **تمرین ۱**: برنامه‌ای بنویسید که نام شما را در خروجی چاپ کند.  

---

## **۴. متغیرها و انواع داده‌ها 📝**  
در کاتلین، دو نوع متغیر وجود دارد:  
- **`val`** → مقدار ثابت (تغییر نمی‌کند)  
- **`var`** → مقدار متغیر (قابل تغییر است)  

```kotlin
val name = "Saeid"   // مقدار ثابت
var age = 25         // مقدار متغیر
age = 26             // مقدار جدید
```  

### **انواع داده‌ای در کاتلین**  
| نوع داده‌ای  | توضیح                 | مثال |
|-------------|----------------------|------|
| `Int`       | عدد صحیح              | `val number: Int = 10` |
| `Double`    | عدد اعشاری            | `val pi: Double = 3.14` |
| `Boolean`   | مقدار درست/غلط        | `val isStudent: Boolean = true` |
| `String`    | متن                   | `val message: String = "Hello"` |

✏️ **تمرین ۲**: برنامه‌ای بنویسید که نام، سن، و علاقه‌مندی شما را در متغیرهای جداگانه ذخیره کند و نمایش دهد.  

---

## **۵. شرط‌ها و تصمیم‌گیری‌ها ✅**  
برای اجرای شرطی از `if` یا `when` استفاده می‌کنیم.  

### **مثال: بررسی زوج یا فرد بودن عدد**  
```kotlin
val number = 10
if (number % 2 == 0) {
    println("عدد زوج است")
} else {
    println("عدد فرد است")
}
```  

### **مثال: استفاده از `when` برای بررسی مقدار**  
```kotlin
val grade = "A"
when (grade) {
    "A" -> println("عالی")
    "B" -> println("خوب")
    "C" -> println("متوسط")
    else -> println("نیاز به تلاش بیشتر")
}
```

✏️ **تمرین ۳**: برنامه‌ای بنویسید که یک عدد بگیرد و بررسی کند که مثبت، منفی یا صفر است.  

---

## **۶. حلقه‌ها (Loops) 🔄**  
### **حلقه `for` برای تکرار عملیات**  
```kotlin
for (i in 1..5) {
    println("عدد: $i")
}
```

### **حلقه `while` برای اجرای شرطی**  
```kotlin
var count = 3
while (count > 0) {
    println("باقی‌مانده: $count")
    count--
}
```

✏️ **تمرین ۴**: برنامه‌ای بنویسید که اعداد ۱ تا ۱۰ را نمایش دهد.  

---

## **۷. تمرین پایانی 🎯**  
✍️ **تکلیف**:  
برنامه‌ای بنویسید که یک عدد از کاربر دریافت کند و بررسی کند که **عدد اول** است یا خیر.  

💡 **راهنمایی:** عدد اول عددی است که فقط بر ۱ و خودش بخش‌پذیر باشد.  

---

📌 این جلسه پایه‌ای‌ترین مفاهیم برنامه‌نویسی را پوشش داد. در جلسه بعد، به **توابع، لیست‌ها و پردازش داده‌ها** می‌پردازیم. 🚀  

💬 هر سوالی داشتید در قسمت **Issues** گیت‌هاب بپرسید یا در **Pull Request** تمرین‌های خود را ارسال کنید. 😊  
