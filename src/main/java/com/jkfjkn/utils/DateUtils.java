package com.jkfjkn.utils;

import lombok.SneakyThrows;
import org.apache.commons.lang3.StringUtils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

/**
 * 项目名: tls
 * 文件名: DateUtil
 * 创建者: admin
 * 创建时间:2019/4/22 12:11
 * 描述: 日期工具类
 */
public class DateUtils {
    /**
     * 默认格式化日期格式 YYYYMMdd
     *
     * @param date
     * @return
     */
    public static String format(Date date) {
        if (null == date) throw new RuntimeException("NPE:format date object is null");
        return new SimpleDateFormat("yyyyMMdd").format(date);
    }

    public static String formatMMdd(Date date) {
        if (null == date) throw new RuntimeException("NPE:format date object is null");
        return new SimpleDateFormat("MM-dd").format(date);
    }

    /**
     * 默认格式化日期格式 HH:mm
     *
     * @param date
     * @return
     */
    public static String dateToHHmmStr1(Date date) {
        if (null == date) {
            return null;
        }
        return new SimpleDateFormat("HHmmss").format(date);
    }

    /**
     * 时间差值（秒）
     *
     * @param startTime 开始时间
     * @param endTime   结束时间
     * @return
     */
    public static String sumDate(Date startTime, Date endTime) {
        if (null == startTime || null == endTime) {
            return null;
        }
        // 格式化日期时间
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 格式化后的时间
        String startTimeFmt = dateTimeFormat.format(startTime);
        // 格式化后的日期时间
        String endTimeFmt = dateTimeFormat.format(endTime);
        long result = 0;
        try {
            result = (dateTimeFormat.parse(endTimeFmt).getTime() - dateTimeFormat.parse(startTimeFmt)
                    .getTime()) / 1000;// 当前时间减去测试时间
            // 这个的除以1000得到秒，相应的60000得到分，3600000得到小时
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return String.valueOf(result);

    }

    /**
     * 时间差值（秒）
     *
     * @param startTime 开始时间
     * @param endTime   结束时间
     * @return
     */
    public static String sumStrDate(String startTime, String endTime) {
        if (null == startTime || null == endTime) {
            return null;
        }

        long result = 0;
        try {
            // 格式化日期时间
            SimpleDateFormat dateTimeFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
            // 格式化后的时间
            long startTimeFmt = dateTimeFormat.parse(startTime).getTime();
            // 格式化后的日期时间
            long endTimeFmt = dateTimeFormat.parse(endTime).getTime();
            result = (endTimeFmt - startTimeFmt) / 1000;// 当前时间减去测试时间
            // 这个的除以1000得到秒，相应的60000得到分，3600000得到小时
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return String.valueOf(result);

    }

    /**
     * 时间差值（秒）
     *
     * @param startTime 开始时间
     * @param endTime   结束时间
     * @return
     */
    public static long sumLongDate(Date startTime, Date endTime) {
        if (null == startTime || null == endTime) {
            return 0;
        }
        // 格式化日期时间
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 格式化后的时间
        String startTimeFmt = dateTimeFormat.format(startTime);
        // 格式化后的日期时间
        String endTimeFmt = dateTimeFormat.format(endTime);
        long result = 0;
        try {
            result = (dateTimeFormat.parse(endTimeFmt).getTime() - dateTimeFormat.parse(startTimeFmt)
                    .getTime()) / 1000;// 当前时间减去测试时间
            // 这个的除以1000得到秒，相应的60000得到分，3600000得到小时
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 默认格式化日期格式 yyyy-MM-dd HH:mm:ss
     *
     * @param date
     * @return
     */
    public static String dateToStr(Date date) {
        if (null == date) {
            return null;
        }
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
    }

    /**
     * 默认格式化日期格式 yyyy-MM-dd HH:mm:ss
     *
     * @param date
     * @return
     */
    public static String dateToStr(Date date, String format) {
        if (null == date && StringUtils.isNotBlank(format)) {
            return null;
        }
        return new SimpleDateFormat(format).format(date);
    }

    /**
     * 默认格式化日期格式 yyyy/M/d HH:mm:ss
     *
     * @param date
     * @return
     */
    public static String dateToBiasStr(Date date) {
        if (null == date) {
            return null;
        }
        return new SimpleDateFormat("yyyy/M/d HH:mm:ss").format(date);
    }


    /**
     * 默认格式化日期格式 yyyy/M/d
     *
     * @param date
     * @return
     */
    public static String dateToSlashStr(Date date) {
        if (null == date) {
            return null;
        }
        return new SimpleDateFormat("yyyy/M/d H:mm:ss").format(date);
    }

    /**
     * 默认格式化日期格式 yyyy/M/d
     *
     * @param date
     * @return
     */
    public static String dateToSlashDate(Date date) {
        if (null == date) {
            return null;
        }
        return new SimpleDateFormat("yyyy/M/d").format(date);
    }

    /**
     * 默认格式化日期格式 H:mm:ss
     *
     * @param date
     * @return
     */
    public static String dateToSlashTime(Date date) {
        if (null == date) {
            return null;
        }
        return new SimpleDateFormat("H:mm:ss").format(date);
    }

    /**
     * 默认格式化日期格式 yyyy-MM-dd
     *
     * @param date
     * @return
     */
    public static String shortDateToStr(Date date) {
        if (null == date) {
            throw new RuntimeException("NPE:format date object is null");
        }
        return new SimpleDateFormat("yyyy-MM-dd").format(date);
    }

    public static Date shortDateToStr(int minute) {
        // 获取当前时间
        Calendar calendar = Calendar.getInstance();
        Date currentDate = calendar.getTime(); // 当前时间的Date对象

        // 计算30分钟前的时间
        calendar.add(Calendar.MINUTE, minute);
        Date minutesAgoDate = calendar.getTime();
        return minutesAgoDate;
    }

    /**
     * 默认格式化日期格式 yyyyMMdd
     *
     * @param date
     * @return
     */
    public static String shortDateToStr1(Date date) {
        if (null == date) {
            throw new RuntimeException("NPE:format date object is null");
        }
        return new SimpleDateFormat("yyyyMMdd").format(date);
    }

    /**
     * 默认格式化日期格式 yyyy-MM-dd
     *
     * @param date
     * @return
     */
    public static Date shortDateToDate(Date date) {
        if (null == date) {
            return null;
        }
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = formatter.format(date);
        ParsePosition pos = new ParsePosition(0);
        Date dateToDate = formatter.parse(strDate, pos);
        return dateToDate;
    }

    /**
     * 默认格式化日期格式 yyyy-M-d
     *
     * @param date
     * @return
     */
    public static String shortDateToShortStr(Date date) {
        if (null == date) {
            throw new RuntimeException("NPE:format date object is null");
        }
        return new SimpleDateFormat("yyyy-M-d").format(date);
    }

    /**
     * 默认格式化日期格式 yyyy-MM-dd HH:mm:ss
     *
     * @param date
     * @return
     */
    public static Date dateToDate(Date date) {
        if (null == date) {
            throw new RuntimeException("NPE:format date object is null");
        }
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strDate = formatter.format(date);
        ParsePosition pos = new ParsePosition(0);
        Date dateToDate = formatter.parse(strDate, pos);
        return dateToDate;
    }

    /**
     * 默认格式化日期格式 yyyy-MM-dd
     *
     * @param date
     * @return
     */
    public static Date strToShortDate(String date) {
        if (null == date || "".equals(date)) {
            return null;
        }
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = formatter.parse(date, pos);
        return strtodate;
    }

    /**
     * 默认格式化日期格式 yyyy-MM-dd
     *
     * @param date
     * @return
     */
    public static Date formatYYYYMM(Date date) {
        if (null == date || "".equals(date)) {
            return null;
        }
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM");
        String strDate = formatter.format(date);
        ParsePosition pos = new ParsePosition(0);
        Date dateToDate = formatter.parse(strDate, pos);
        return dateToDate;
    }

    /**
     * 默认格式化日期格式 yyyy-MM-dd HH:mm:ss
     *
     * @param date
     * @return
     */
    public static Date strToDate(String date) {
        if (null == date || "".equals(date)) {
            return null;
        }
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = formatter.parse(date, pos);
        return strtodate;
    }

    /**
     * 默认格式化日期格式 HH:mm
     *
     * @param date
     * @return
     */
    public static String dateToHHmmStr(Date date) {
        if (null == date) {
            return null;
        }
        return new SimpleDateFormat("HH:mm").format(date);
    }

    /**
     * 默认格式化日期格式 HH:mm:ss
     *
     * @param date
     * @return
     */
    public static String dateToHHmmssStr(Date date) {
        if (null == date) {
            return null;
        }
        return new SimpleDateFormat("HH:mm:ss").format(date);
    }

    public static String dateFormat(Date date) {
        // 格式化日期时间
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        return dateTimeFormat.format(date);
    }

    public static String dateFormat2(Date date) {
        if (date == null) {
            return "";
        }
        // 格式化日期时间
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
        return dateTimeFormat.format(date);
    }

    /**
     * 标准日期format yyyy-MM-dd HH:mm:ss
     *
     * @return
     */
    public static String dateFormatStandard(Date date) {
        // 格式化日期时间
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        return dateTimeFormat.format(date);
    }

    public static String getTime(long timeSpan) {
        // 格式化日期时间
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date date = new Date(timeSpan);
        return dateTimeFormat.format(date);

    }

    public static String getTime() {
        // 格式化日期时间
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date date = new Date();
        return dateTimeFormat.format(date);
    }

    public static Timestamp getNowTime() {
        return new Timestamp(Calendar.getInstance().getTimeInMillis());
    }

    /**
     * 时间加算
     *
     * @param date    需要加算的时间
     * @param strTime 加算分钟
     * @return
     */
    public static String subTime(Date date, String strTime) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long time = Long.valueOf(strTime) * 60 * 1000;

        Date afterDate = new Date(date.getTime() + time);
        return sdf.format(afterDate);
    }

    /**
     * 获取当前时间的小时+分钟
     *
     * @return
     */
    public static String getHourMinute(int minute) {
        return subTime(new Date(), String.valueOf(minute)).substring(11, 16);
    }

    public static String calcSysTimeStr(int calendarType, int value) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance(); //创建Calendar 的实例
        calendar.add(calendarType, value);
        Date date = new Date(calendar.getTimeInMillis());//获取当前时间;
        return sdf.format(date);
    }

    /**
     * 根据参数计算当前时间的前后时间
     *
     * @param calendarType
     * @param value
     * @return
     */
    public static Date calcSysTime(int calendarType, int value) {
        Calendar calendar = Calendar.getInstance(); //创建Calendar 的实例
        calendar.add(calendarType, value);
        Date date = new Date(calendar.getTimeInMillis());//获取当前时间;
        return date;
    }

    public static String calcSysTimeStr() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance(); //创建Calendar 的实例
        Date date = new Date(calendar.getTimeInMillis());//获取当前时间;
        return sdf.format(date);
    }


    /**
     * 截取完整日期到分钟（没有冒号）
     *
     * @param dateStr
     * @return
     */
    public static String subDateUntilMinute(String dateStr) {
        if (StringUtils.isEmpty(dateStr)) {
            return null;
        }
        return dateStr.substring(0, 16);
    }

    public static String subDateUntilHour(String dateStr) {
        if (StringUtils.isEmpty(dateStr)) {
            return null;
        }
        return dateStr.substring(0, 13);
    }

    /**
     * 毫秒级时间戳
     *
     * @return
     */
    public static Long getTimestamp() {
        Date date = new Date();
        String timestamp = String.valueOf(date.getTime());
        return Long.valueOf(timestamp);
    }

    /**
     * 毫秒级时间戳
     *
     * @return
     */
    public static Long getTimestamp(Date date) {
        String timestamp = String.valueOf(date.getTime());
        return Long.valueOf(timestamp);
    }

    /**
     * Date转换为LocalDateTime
     *
     * @param date
     */
    public static LocalDateTime dateToLocalDateTime(Date date) {
        Instant instant = date.toInstant();//An instantaneous point on the time-line.(时间线上的一个瞬时点。)
        ZoneId zoneId = ZoneId.systemDefault();//A time-zone ID, such as {@code Europe/Paris}.(时区)
        //2018-03-27T14:07:32.668
        LocalDateTime localDateTime = instant.atZone(zoneId).toLocalDateTime();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");//This class is immutable and thread-safe.@since 1.8
        return localDateTime;
    }

    /**
     * LocalDateTime转换为Date
     *
     * @param localDateTime
     */
    public static Date localDateTimeToDate(LocalDateTime localDateTime) {
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zdt = localDateTime.atZone(zoneId);//Combines this date-time with a time-zone to create a  ZonedDateTime.
        Date date = Date.from(zdt.toInstant());
        return date;
    }


    /**
     * SqlServer减8个小时
     */
    public static Date DateCut8Hours(Date date) {
        LocalDateTime localDateTime = dateToLocalDateTime(date);
        LocalDateTime plus = localDateTime.plusHours(-8);
        return localDateTimeToDate(plus);
    }

    public static Date DateplusHours(Date date, Long hour) {
        LocalDateTime localDateTime = dateToLocalDateTime(date);
        LocalDateTime plus = localDateTime.plusHours(hour);
        return localDateTimeToDate(plus);
    }

    /**
     * 时间减秒
     */
    public static Date DateCutSeconds(Date date, Long seconds) {
        LocalDateTime localDateTime = dateToLocalDateTime(date);
        LocalDateTime dateTime = localDateTime.plusSeconds(seconds);
        return localDateTimeToDate(dateTime);
    }

    /**
     * 时间减分钟
     */
    public static Date DateCutMill(Date date, Long mill) {
        LocalDateTime localDateTime = dateToLocalDateTime(date);
        LocalDateTime dateTime = localDateTime.plusMinutes(mill);
        return localDateTimeToDate(dateTime);
    }


    /**
     *
     */
    public static String StringDatePlus1(String dateStr) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH");
            LocalDateTime stringDateTime = dateToLocalDateTime(sdf.parse(dateStr));
            return sdf.format(localDateTimeToDate(stringDateTime.plusHours(1)));
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     *
     */
    public static String StringDatePlus(String dateStr, Integer time) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH");
            LocalDateTime stringDateTime = dateToLocalDateTime(sdf.parse(dateStr));
            return sdf.format(localDateTimeToDate(stringDateTime.plusHours(time)));
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String String2DatePlus(Date dateStr, Integer time) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            LocalDateTime stringDateTime = dateToLocalDateTime(dateStr);
            return sdf.format(localDateTimeToDate(stringDateTime.plusHours(time)));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Date StringDatePlus(Date date, Integer time) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            LocalDateTime stringDateTime = dateToLocalDateTime(date);
            return localDateTimeToDate(stringDateTime.plusHours(time));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    /**
     * 获取指定时间n个小时整点时间
     *
     * @param date
     * @return
     */
    public static Date getHourTime(Date date, int n, String direction) {
        Calendar ca = Calendar.getInstance();
        ca.setTime(date);
        ca.set(Calendar.MINUTE, 0);
        ca.set(Calendar.SECOND, 0);
        switch (direction) {
            case "+":
                ca.set(Calendar.HOUR_OF_DAY, ca.get(Calendar.HOUR_OF_DAY) + n);
                break;
            case "-":
                ca.set(Calendar.HOUR_OF_DAY, ca.get(Calendar.HOUR_OF_DAY) - n);
                break;
            case "=":
                ca.set(Calendar.HOUR_OF_DAY, ca.get(Calendar.HOUR_OF_DAY));
                break;
            default:
                ca.set(Calendar.HOUR_OF_DAY, ca.get(Calendar.HOUR_OF_DAY));
        }

        date = ca.getTime();
        return date;
    }

    /**
     * 获取指定时间上n个小时整点时间
     *
     * @param date
     * @return
     */
    public static Date getLastHourTime(Date date, int n) {
        return getHourTime(date, n, "-");
    }

    /**
     * 获取当前时间小时整点时间
     *
     * @param
     * @return
     */
    public static Date getCurrentHourTime() {
        return getHourTime(new Date(), 0, "=");
    }


    /**
     * 获取指定时间下n个小时整点时间
     *
     * @param date
     * @return
     */
    public static Date getNextHourTime(Date date, int n) {
        return getHourTime(date, n, "+");
    }

    /**
     * 取前10s时间戳
     *
     * @return
     */
    public static long getFrontTime(Long time) {
        Long frontTime = time - 10000;
        return frontTime;
    }

    public static String fromLongToDate(Long time, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date date = new Date(time);
        return sdf.format(date);
    }

    public static Date sumTimestamp(Date date, int s) {
        long time = s * 1000;
        return new Date(date.getTime() + time);
    }

    /**
     * 获取当月第一天
     */
    public static Date getMonthOneDay(){
        Date date = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, 0);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        return shortDateToDate(calendar.getTime());
    }
    /**
     * 获取当年第一天
     */
    public static Date getYearOneDay(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_YEAR, 1);

        return shortDateToDate(calendar.getTime());
    }
    /**
     * 获取当天0时
     */
    public static Date getDayOneDay(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return shortDateToDate(calendar.getTime());
    }

    /**
     * long类型转换成日期
     *
     * @param lo 毫秒数
     * @return String yyyy-MM-dd HH:mm:ss
     */
    public static Date longToDate(long lo) throws ParseException {
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //long转Date
        Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sd.format(new Date(lo)));
        return date;
    }
    /**
     * 昨天0点
     *
     * @author sh
     *
     */
    public static Date getZeroTime(Date date,Integer offset) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
//        calendar.set(Calendar.DATE,offset);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        return calendar.getTime();
    }
    /**
     * 获得最后时间
     *
     * @author sh
     *
     */
    public static Date getEndTime(Date date,Integer offset) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
//        calendar.set(Calendar.DATE,offset);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        return calendar.getTime();
    }

    /**
     * 获取年
     * @param dateStr
     * @return
     */
    public static String getYearStr(String dateStr) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(strToDate(dateStr));
        int year = calendar.get(Calendar.YEAR);
        return String.valueOf(year);
    }

    /**
     * 获取年
     * @param date
     * @return
     */
    public static int getYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        return year;
    }

    /**
     * 获取月
     * @param dateStr
     * @return
     */
    public static String getMonthStr(String dateStr) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(strToDate(dateStr));
        int month = calendar.get(Calendar.MONTH) + 1;
        String s = String.format("%02d", month);
        return s;
    }

    /**
     * 获取月
     * @param date
     * @return
     */
    public static int getMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int month = calendar.get(Calendar.MONTH) + 1;
        return month;
    }

    /**
     * 获取日
     * @param dateStr
     * @return
     */
    public static String getDayStr(String dateStr) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(strToDate(dateStr));
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        String s = String.format("%02d", day);
        return s;
    }

    /**
     * 获取日
     * @param date
     * @return
     */
    public static int getDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        return day;
    }

    /**
     * 获取季度
     * @param dateStr
     * @return
     */
    public static String getSeason(String dateStr) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(strToDate(dateStr));
        int month = calendar.get(Calendar.MONTH) + 1;
        return String.valueOf(month % 3 == 0 ? month / 3 : month / 3 + 1);
    }

    @SneakyThrows
    public static Date getYesterday(Date nowDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(nowDate);
        calendar.add(Calendar.DATE, -1);
        return calendar.getTime();
    }

    public static Date zonedDateTime(String dateTimeStr) {
        if (StringUtils.isBlank(dateTimeStr)) {
            return null;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSX");
        try {
            // 首先解析为ZonedDateTime，因为它包含时区信息
            ZonedDateTime zonedDateTime = ZonedDateTime.parse(dateTimeStr, formatter);
            ZonedDateTime plus8Hours = zonedDateTime.plusHours(8);
            // 如果你只需要LocalDateTime，可以去除时区信息
            LocalDateTime localDateTime = plus8Hours.toLocalDateTime();
            DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedTime = localDateTime.format(formatter1);
            return strToDate(formattedTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Date> getDateList(String startDateStr, String endDateStr) {
        List<Date> dateList = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate startDate = LocalDate.parse(startDateStr + "-01", formatter);
        LocalDate endDate = LocalDate.parse(endDateStr + "-01", formatter);
        long monthsBetween = ChronoUnit.MONTHS.between(startDate, endDate);
        for (int i = 0; i <= monthsBetween; i++) {
            LocalDate date = startDate.plusMonths(i);
            dateList.add(Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        }
        return dateList;
    }
}