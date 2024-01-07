// Copyright (c) 2019, the Dart project authors.  Please see the AUTHORS file
// for details. All rights reserved. Use of this source code is governed by a
// BSD-style license that can be found in the LICENSE file.

import 'package:flutter/material.dart';

void main() {
  runApp(App());
}

//화면 띄우기, App is root
class App extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      //home: 위젯 / 이 아래는 전부 위젯입니다.
      home: Scaffold(
        appBar: AppBar(
          title: Text('Hello flutter'),
        ),  
        body: Center(
          child: Text("Hello world!"),
        ),
      ),
    );
  }
}
