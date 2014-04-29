/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2013 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package ti.yandex.mobile.metrica;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.TiApplication;
import org.appcelerator.kroll.common.Log;

import com.yandex.metrica.*;

@Kroll.module(name = "TiYandexMobileMetricaAndroid", id = "ti.yandex.mobile.metrica")
public class TiYandexMobileMetricaAndroidModule extends KrollModule {

	// Standard Debugging variables
	private static final String TAG = "TiYandexMobileMetricaAndroidModule";

	// You can define constants with @Kroll.constant, for example:
	// @Kroll.constant public static final String EXTERNAL_NAME = value;

	public TiYandexMobileMetricaAndroidModule() {
		super();
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app) {
		Log.d(TAG, "initialize yandex metrica");
		Counter.initialize(app.getApplicationContext());
	}

	// Позволяет установить API-ключ
	@Kroll.method
	public void setApiKey(String apiKey) {
		Counter.sharedInstance().setApiKey(apiKey);
	}

	// Позволяет включать и отключать отправку отчетов
	@Kroll.method
	public void setReportsEnabled(boolean enabled) {
		Counter.sharedInstance().setReportsEnabled(enabled);
	}

	// Позволяет отслеживать аварийные остановки приложения.
	// По умолчанию отчеты об аварийных остановках приложения отправляются. Вы
	// можете отключить отслеживание
	@Kroll.method
	public void setReportCrashesEnabled(boolean enabled) {
		Counter.sharedInstance().setReportCrashesEnabled(enabled);
	}

	// Позволяет отправлять отчеты об аварийных остановках приложения вручную.
	@Kroll.method
	public void reportUnhandledException(Throwable exception) {
		Counter.sharedInstance().reportUnhandledException(exception);
	}

	// Позволяет включить или отключить автоматическое определение
	// местоположения
	@Kroll.method
	public void setTrackLocationEnabled(boolean enabled) {
		Counter.sharedInstance().setTrackLocationEnabled(enabled);
	}

	// Позволяет передавать собственные данные о местоположении устройства
	@Kroll.method
	public void setLocation(double latitude, double longitude) {
		Counter.sharedInstance().setLocation(latitude, longitude);
	}

	// Отправляет произвольное сообщение о событии
	@Kroll.method
	public void reportEvent(String eventName) {
		Counter.sharedInstance().reportEvent(eventName);
	}

	// Позволяет отправлять ваше сообщение об ошибке
	@Kroll.method
	public void reportError(String message, Throwable error) {
		Counter.sharedInstance().reportError(message, error);
	}

	// Позволяет задать продолжительность сессии (в секундах)
	@Kroll.method
	public void setSessionTimeout(int sessionTimeoutSeconds) {
		Counter.sharedInstance().setSessionTimeout(sessionTimeoutSeconds);
	}

	// Позволяет запустить новую сессию вручную
	@Kroll.method
	public void startNewSessionManually() {
		Counter.sharedInstance().startNewSessionManually();
	}

	// Позволяет задать интервал в секундах между отправками событий на сервер
	@Kroll.method
	public void setDispatchPeriod(int dispatchPeriodSeconds) {
		Counter.sharedInstance().setDispatchPeriod(dispatchPeriodSeconds);
	}

	// Позволяет задать число событий в хранилище, при достижении которого
	// происходит отправка всех накопившихся событий на сервер
	@Kroll.method
	public void setMaxReportsCount(int maxReportsCount) {
		Counter.sharedInstance().setMaxReportsCount(maxReportsCount);
	}

	// Позволяет отправить все накопившиеся события, не дожидаясь автоматической
	// отправки на сервер
	@Kroll.method
	public void sendEventsBuffer() {
		Counter.sharedInstance().sendEventsBuffer();
	}

	// По умолчанию версия приложения задается в файле AndroidManifest.xml.
	// Данный метод позволяет указать версию приложения непосредственно из кода
	// приложения
	@Kroll.method
	public void setCustomAppVersion(String appVersion) {
		Counter.sharedInstance().setCustomAppVersion(appVersion);
	}

	// Далее приведены статические методы объекта Counter:
	// Позволяет определить уровень API библиотеки
	@Kroll.method
	// Метод Описание
	public int getLibraryApiLevel() {
		return Counter.getLibraryApiLevel();
	}

	// Позволяет определить версию библиотеки
	@Kroll.method
	public String getLibraryVersion() {
		return Counter.getLibraryVersion();
	}

	// Позволяет определить работает ли ваше приложение в процессе «Metrica».
	@Kroll.method
	public void isMetricaProcess() {
		Counter.isMetricaProcess(TiApplication.getInstance().getApplicationContext());
	}

}
