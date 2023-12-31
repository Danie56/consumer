package com.demo.xyz.shared.config.exception;

import lombok.Getter;

@Getter
public enum ExceptionCode {
  NOT_FOUND("ERR-001");

  private final String code;

  ExceptionCode(String code) {
    this.code = code;
  }
}
