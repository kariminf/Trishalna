# Trishalna

[![Project](https://img.shields.io/badge/Project-Trishalna-4B0082.svg)](https://github.com/kariminf/Trishalna)
[![Version](https://img.shields.io/badge/Version-0.0.1-4B0082.svg)](http://www.apache.org/licenses/LICENSE-2.0)
[![License](https://img.shields.io/badge/License-Apache_2-4B0082.svg)](http://www.apache.org/licenses/LICENSE-2.0)
<!---
[![Travis](https://img.shields.io/travis/kariminf/SentRep.svg)](https://travis-ci.org/kariminf/SentRep)
[![codecov](https://img.shields.io/codecov/c/github/kariminf/SentRep.svg)](https://codecov.io/gh/kariminf/SentRep)
[![jitpack](https://jitpack.io/v/kariminf/SentRep.svg)](https://jitpack.io/#kariminf/SentRep)
 --->

An anti-fraud program that I didn't finish. May be some day :p

## API

### Filter

Used to filter part of code which we don't want to compare.

* List<String> filterKeywords(List<String> words): filter the keywords
* boolean deleteLine (String line): returns true if the line is not important, so we can delete it.

### Segmenter

Used to segment the different parts of the code

* List<String> getLines(String program): get the lines.

* List<String> getWords(String line): get the words.

### TODO

* Implement a scorer
* Add a UI (console and graphical)
* More languages (currently, just java)

## License

Copyright (C) 2016-2017 Abdelkrime Aries

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
