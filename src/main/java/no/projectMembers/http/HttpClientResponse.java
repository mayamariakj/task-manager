package no.projectMembers.http;

import java.io.IOException;
import java.io.InputStream;

    public class HttpClientResponse extends HttpMessage {

        public HttpClientResponse(InputStream inputStream) throws IOException {

            super(inputStream);
        }

        public int getStatusCode(){
            return Integer.parseInt(startLine.split(" ")[1]);
        }

        public String getHeader(String headerName) {
            return headers.get(headerName.toLowerCase());

        }

        public int getContentLength() {
            return Integer.parseInt(getHeader("content-length"));
        }

        public String getBody() {
            return body;
        }

    }

