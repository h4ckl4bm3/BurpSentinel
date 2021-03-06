/*
 * Copyright (C) 2013 DobinRutishauser@broken.ch
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package standalone;

import burp.IBurpCollaboratorClientContext;
import burp.IBurpExtenderCallbacks;
import burp.IContextMenuFactory;
import burp.ICookie;
import burp.IExtensionHelpers;
import burp.IExtensionStateListener;
import burp.IHttpListener;
import burp.IHttpRequestResponse;
import burp.IHttpRequestResponsePersisted;
import burp.IHttpRequestResponseWithMarkers;
import burp.IHttpService;
import burp.IIntruderPayloadGeneratorFactory;
import burp.IIntruderPayloadProcessor;
import burp.IMenuItemHandler;
import burp.IMessageEditor;
import burp.IMessageEditorController;
import burp.IMessageEditorTabFactory;
import burp.IProxyListener;
import burp.IScanIssue;
import burp.IScanQueueItem;
import burp.IScannerCheck;
import burp.IScannerInsertionPointProvider;
import burp.IScannerListener;
import burp.IScopeChangeListener;
import burp.ISessionHandlingAction;
import burp.ITab;
import burp.ITempFile;
import burp.ITextEditor;
import java.awt.Component;
import java.io.File;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.util.List;
import java.util.Map;

/**
 *
 * @author DobinRutishauser@broken.ch
 */
public class StandaloneBurpCallbacks implements IBurpExtenderCallbacks {

    private StandaloneBurpHelper standaloneBurpHelper;
    
    public StandaloneBurpCallbacks() {
        standaloneBurpHelper = new StandaloneBurpHelper();
    }
    
    @Override
    public void setExtensionName(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IExtensionHelpers getHelpers() {
        return standaloneBurpHelper;
    }

    @Override
    public OutputStream getStdout() {
        return System.out;
    }

    @Override
    public OutputStream getStderr() {
        return System.err;
    }

    @Override
    public void registerExtensionStateListener(IExtensionStateListener listener) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void registerHttpListener(IHttpListener listener) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void registerProxyListener(IProxyListener listener) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void registerScannerListener(IScannerListener listener) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void registerContextMenuFactory(IContextMenuFactory factory) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void registerMessageEditorTabFactory(IMessageEditorTabFactory factory) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void registerScannerInsertionPointProvider(IScannerInsertionPointProvider provider) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void registerScannerCheck(IScannerCheck check) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void registerIntruderPayloadGeneratorFactory(IIntruderPayloadGeneratorFactory factory) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void registerIntruderPayloadProcessor(IIntruderPayloadProcessor processor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void registerSessionHandlingAction(ISessionHandlingAction action) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addSuiteTab(ITab tab) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeSuiteTab(ITab tab) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void customizeUiComponent(Component component) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IMessageEditor createMessageEditor(IMessageEditorController controller, boolean editable) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ITextEditor createTextEditor() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void sendToRepeater(String host, int port, boolean useHttps, byte[] request, String tabCaption) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void sendToIntruder(String host, int port, boolean useHttps, byte[] request) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void sendToIntruder(String host, int port, boolean useHttps, byte[] request, List<int[]> payloadPositionOffsets) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void sendToSpider(URL url) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IScanQueueItem doActiveScan(String host, int port, boolean useHttps, byte[] request) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IScanQueueItem doActiveScan(String host, int port, boolean useHttps, byte[] request, List<int[]> insertionPointOffsets) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void doPassiveScan(String host, int port, boolean useHttps, byte[] request, byte[] response) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IHttpRequestResponse makeHttpRequest(IHttpService httpService, byte[] request) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public byte[] makeHttpRequest(String host, int port, boolean useHttps, byte[] request) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isInScope(URL url) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void includeInScope(URL url) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void excludeFromScope(URL url) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void issueAlert(String message) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IHttpRequestResponse[] getProxyHistory() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IHttpRequestResponse[] getSiteMap(String urlPrefix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IScanIssue[] getScanIssues(String urlPrefix) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addToSiteMap(IHttpRequestResponse item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void restoreState(File file) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void saveState(File file) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Map<String, String> saveConfig() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void loadConfig(Map<String, String> config) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setProxyInterceptionEnabled(boolean enabled) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String[] getBurpVersion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void exitSuite(boolean promptUser) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ITempFile saveToTempFile(byte[] buffer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IHttpRequestResponsePersisted saveBuffersToTempFiles(IHttpRequestResponse httpRequestResponse) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IHttpRequestResponseWithMarkers applyMarkers(IHttpRequestResponse httpRequestResponse, List<int[]> requestMarkers, List<int[]> responseMarkers) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getToolName(int toolFlag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addScanIssue(IScanIssue issue) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String[][] getParameters(byte[] request) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String[] getHeaders(byte[] message) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void registerMenuItem(String menuItemCaption, IMenuItemHandler menuItemHandler) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void registerScopeChangeListener(IScopeChangeListener listener) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void unloadExtension() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String[] getCommandLineArguments() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void saveExtensionSetting(String name, String value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String loadExtensionSetting(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void generateScanReport(String format, IScanIssue[] issues, File file) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<ICookie> getCookieJarContents() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void updateCookieJar(ICookie cookie) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void printOutput(String output) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printError(String error) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<IExtensionStateListener> getExtensionStateListeners() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeExtensionStateListener(IExtensionStateListener listener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<IHttpListener> getHttpListeners() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeHttpListener(IHttpListener listener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<IProxyListener> getProxyListeners() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeProxyListener(IProxyListener listener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<IScannerListener> getScannerListeners() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeScannerListener(IScannerListener listener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<IScopeChangeListener> getScopeChangeListeners() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeScopeChangeListener(IScopeChangeListener listener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<IContextMenuFactory> getContextMenuFactories() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeContextMenuFactory(IContextMenuFactory factory) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<IMessageEditorTabFactory> getMessageEditorTabFactories() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeMessageEditorTabFactory(IMessageEditorTabFactory factory) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<IScannerInsertionPointProvider> getScannerInsertionPointProviders() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeScannerInsertionPointProvider(IScannerInsertionPointProvider provider) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<IScannerCheck> getScannerChecks() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeScannerCheck(IScannerCheck check) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<IIntruderPayloadGeneratorFactory> getIntruderPayloadGeneratorFactories() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeIntruderPayloadGeneratorFactory(IIntruderPayloadGeneratorFactory factory) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<IIntruderPayloadProcessor> getIntruderPayloadProcessors() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeIntruderPayloadProcessor(IIntruderPayloadProcessor processor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ISessionHandlingAction> getSessionHandlingActions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeSessionHandlingAction(ISessionHandlingAction action) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sendToComparer(byte[] data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String saveConfigAsJson(String... configPaths) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void loadConfigFromJson(String config) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getExtensionFilename() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isExtensionBapp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IBurpCollaboratorClientContext createBurpCollaboratorClientContext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
