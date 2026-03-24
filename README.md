```mermaid
graph TD
%% 全局样式
classDef abstract fill:#e1f5fe,stroke:#01579b,stroke-width:2px;
classDef entity fill:#fff3e0,stroke:#e65100,stroke-width:2px;

    Root[IO 流体系] --> ByteStream[字节流]
    Root --> CharStream[字符流]

    %% 字节流分支
    ByteStream --> InputStream[InputStream<br/>字节输入流]
    ByteStream --> OutputStream[OutputStream<br/>字节输出流]

    InputStream --> FileInputStream[FileInputStream<br/>文件字节输入流]
    InputStream --> BufferedInputStream[BufferedInputStream<br/>字节缓冲输入流]

    OutputStream --> FileOutputStream[FileOutputStream<br/>文件字节输出流]
    OutputStream --> BufferedOutputStream[BufferedOutputStream<br/>字节缓冲输出流]

    %% 字符流分支
    CharStream --> Reader[Reader<br/>字符输入流]
    CharStream --> Writer[Writer<br/>字符输出流]

    Reader --> FileReader[FileReader<br/>文件字符输入流]
    Reader --> BufferedReader[BufferedReader<br/>字符缓冲输入流]

    Writer --> FileWriter[FileWriter<br/>文件字符输出流]
    Writer --> BufferedWriter[BufferedWriter<br/>字符缓冲输出流]

    %% 样式绑定
    class InputStream,OutputStream,Reader,Writer abstract;
    class FileInputStream,FileOutputStream,BufferedInputStream,BufferedOutputStream,FileReader,FileWriter,BufferedReader,BufferedWriter entity;