// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: main/java/schema.proto

// Protobuf Java Version: 3.25.0
package com.example.trendingservice.generatedCode;

/**
 * Protobuf type {@code TrendingMoviesResponse}
 */
public final class TrendingMoviesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:TrendingMoviesResponse)
    TrendingMoviesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TrendingMoviesResponse.newBuilder() to construct.
  private TrendingMoviesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TrendingMoviesResponse() {
    movies_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TrendingMoviesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.trendingservice.generatedCode.TrendingMoviesGrpc.internal_static_TrendingMoviesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.trendingservice.generatedCode.TrendingMoviesGrpc.internal_static_TrendingMoviesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.trendingservice.generatedCode.TrendingMoviesResponse.class, com.example.trendingservice.generatedCode.TrendingMoviesResponse.Builder.class);
  }

  public static final int MOVIES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.example.trendingservice.generatedCode.MovieInfo> movies_;
  /**
   * <code>repeated .MovieInfo movies = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.example.trendingservice.generatedCode.MovieInfo> getMoviesList() {
    return movies_;
  }
  /**
   * <code>repeated .MovieInfo movies = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.example.trendingservice.generatedCode.MovieInfoOrBuilder> 
      getMoviesOrBuilderList() {
    return movies_;
  }
  /**
   * <code>repeated .MovieInfo movies = 1;</code>
   */
  @java.lang.Override
  public int getMoviesCount() {
    return movies_.size();
  }
  /**
   * <code>repeated .MovieInfo movies = 1;</code>
   */
  @java.lang.Override
  public com.example.trendingservice.generatedCode.MovieInfo getMovies(int index) {
    return movies_.get(index);
  }
  /**
   * <code>repeated .MovieInfo movies = 1;</code>
   */
  @java.lang.Override
  public com.example.trendingservice.generatedCode.MovieInfoOrBuilder getMoviesOrBuilder(
      int index) {
    return movies_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < movies_.size(); i++) {
      output.writeMessage(1, movies_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < movies_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, movies_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.trendingservice.generatedCode.TrendingMoviesResponse)) {
      return super.equals(obj);
    }
    com.example.trendingservice.generatedCode.TrendingMoviesResponse other = (com.example.trendingservice.generatedCode.TrendingMoviesResponse) obj;

    if (!getMoviesList()
        .equals(other.getMoviesList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getMoviesCount() > 0) {
      hash = (37 * hash) + MOVIES_FIELD_NUMBER;
      hash = (53 * hash) + getMoviesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.trendingservice.generatedCode.TrendingMoviesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.trendingservice.generatedCode.TrendingMoviesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.trendingservice.generatedCode.TrendingMoviesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.trendingservice.generatedCode.TrendingMoviesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.trendingservice.generatedCode.TrendingMoviesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.trendingservice.generatedCode.TrendingMoviesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.trendingservice.generatedCode.TrendingMoviesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.trendingservice.generatedCode.TrendingMoviesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.example.trendingservice.generatedCode.TrendingMoviesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.example.trendingservice.generatedCode.TrendingMoviesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.trendingservice.generatedCode.TrendingMoviesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.trendingservice.generatedCode.TrendingMoviesResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.trendingservice.generatedCode.TrendingMoviesResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code TrendingMoviesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TrendingMoviesResponse)
      com.example.trendingservice.generatedCode.TrendingMoviesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.trendingservice.generatedCode.TrendingMoviesGrpc.internal_static_TrendingMoviesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.trendingservice.generatedCode.TrendingMoviesGrpc.internal_static_TrendingMoviesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.trendingservice.generatedCode.TrendingMoviesResponse.class, com.example.trendingservice.generatedCode.TrendingMoviesResponse.Builder.class);
    }

    // Construct using com.example.trendingservice.generatedCode.TrendingMoviesResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (moviesBuilder_ == null) {
        movies_ = java.util.Collections.emptyList();
      } else {
        movies_ = null;
        moviesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.trendingservice.generatedCode.TrendingMoviesGrpc.internal_static_TrendingMoviesResponse_descriptor;
    }

    @java.lang.Override
    public com.example.trendingservice.generatedCode.TrendingMoviesResponse getDefaultInstanceForType() {
      return com.example.trendingservice.generatedCode.TrendingMoviesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.trendingservice.generatedCode.TrendingMoviesResponse build() {
      com.example.trendingservice.generatedCode.TrendingMoviesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.trendingservice.generatedCode.TrendingMoviesResponse buildPartial() {
      com.example.trendingservice.generatedCode.TrendingMoviesResponse result = new com.example.trendingservice.generatedCode.TrendingMoviesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.example.trendingservice.generatedCode.TrendingMoviesResponse result) {
      if (moviesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          movies_ = java.util.Collections.unmodifiableList(movies_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.movies_ = movies_;
      } else {
        result.movies_ = moviesBuilder_.build();
      }
    }

    private void buildPartial0(com.example.trendingservice.generatedCode.TrendingMoviesResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.trendingservice.generatedCode.TrendingMoviesResponse) {
        return mergeFrom((com.example.trendingservice.generatedCode.TrendingMoviesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.trendingservice.generatedCode.TrendingMoviesResponse other) {
      if (other == com.example.trendingservice.generatedCode.TrendingMoviesResponse.getDefaultInstance()) return this;
      if (moviesBuilder_ == null) {
        if (!other.movies_.isEmpty()) {
          if (movies_.isEmpty()) {
            movies_ = other.movies_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMoviesIsMutable();
            movies_.addAll(other.movies_);
          }
          onChanged();
        }
      } else {
        if (!other.movies_.isEmpty()) {
          if (moviesBuilder_.isEmpty()) {
            moviesBuilder_.dispose();
            moviesBuilder_ = null;
            movies_ = other.movies_;
            bitField0_ = (bitField0_ & ~0x00000001);
            moviesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMoviesFieldBuilder() : null;
          } else {
            moviesBuilder_.addAllMessages(other.movies_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.example.trendingservice.generatedCode.MovieInfo m =
                  input.readMessage(
                      com.example.trendingservice.generatedCode.MovieInfo.parser(),
                      extensionRegistry);
              if (moviesBuilder_ == null) {
                ensureMoviesIsMutable();
                movies_.add(m);
              } else {
                moviesBuilder_.addMessage(m);
              }
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<com.example.trendingservice.generatedCode.MovieInfo> movies_ =
      java.util.Collections.emptyList();
    private void ensureMoviesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        movies_ = new java.util.ArrayList<com.example.trendingservice.generatedCode.MovieInfo>(movies_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.trendingservice.generatedCode.MovieInfo, com.example.trendingservice.generatedCode.MovieInfo.Builder, com.example.trendingservice.generatedCode.MovieInfoOrBuilder> moviesBuilder_;

    /**
     * <code>repeated .MovieInfo movies = 1;</code>
     */
    public java.util.List<com.example.trendingservice.generatedCode.MovieInfo> getMoviesList() {
      if (moviesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(movies_);
      } else {
        return moviesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .MovieInfo movies = 1;</code>
     */
    public int getMoviesCount() {
      if (moviesBuilder_ == null) {
        return movies_.size();
      } else {
        return moviesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .MovieInfo movies = 1;</code>
     */
    public com.example.trendingservice.generatedCode.MovieInfo getMovies(int index) {
      if (moviesBuilder_ == null) {
        return movies_.get(index);
      } else {
        return moviesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .MovieInfo movies = 1;</code>
     */
    public Builder setMovies(
        int index, com.example.trendingservice.generatedCode.MovieInfo value) {
      if (moviesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMoviesIsMutable();
        movies_.set(index, value);
        onChanged();
      } else {
        moviesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .MovieInfo movies = 1;</code>
     */
    public Builder setMovies(
        int index, com.example.trendingservice.generatedCode.MovieInfo.Builder builderForValue) {
      if (moviesBuilder_ == null) {
        ensureMoviesIsMutable();
        movies_.set(index, builderForValue.build());
        onChanged();
      } else {
        moviesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .MovieInfo movies = 1;</code>
     */
    public Builder addMovies(com.example.trendingservice.generatedCode.MovieInfo value) {
      if (moviesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMoviesIsMutable();
        movies_.add(value);
        onChanged();
      } else {
        moviesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .MovieInfo movies = 1;</code>
     */
    public Builder addMovies(
        int index, com.example.trendingservice.generatedCode.MovieInfo value) {
      if (moviesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMoviesIsMutable();
        movies_.add(index, value);
        onChanged();
      } else {
        moviesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .MovieInfo movies = 1;</code>
     */
    public Builder addMovies(
        com.example.trendingservice.generatedCode.MovieInfo.Builder builderForValue) {
      if (moviesBuilder_ == null) {
        ensureMoviesIsMutable();
        movies_.add(builderForValue.build());
        onChanged();
      } else {
        moviesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .MovieInfo movies = 1;</code>
     */
    public Builder addMovies(
        int index, com.example.trendingservice.generatedCode.MovieInfo.Builder builderForValue) {
      if (moviesBuilder_ == null) {
        ensureMoviesIsMutable();
        movies_.add(index, builderForValue.build());
        onChanged();
      } else {
        moviesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .MovieInfo movies = 1;</code>
     */
    public Builder addAllMovies(
        java.lang.Iterable<? extends com.example.trendingservice.generatedCode.MovieInfo> values) {
      if (moviesBuilder_ == null) {
        ensureMoviesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, movies_);
        onChanged();
      } else {
        moviesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .MovieInfo movies = 1;</code>
     */
    public Builder clearMovies() {
      if (moviesBuilder_ == null) {
        movies_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        moviesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .MovieInfo movies = 1;</code>
     */
    public Builder removeMovies(int index) {
      if (moviesBuilder_ == null) {
        ensureMoviesIsMutable();
        movies_.remove(index);
        onChanged();
      } else {
        moviesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .MovieInfo movies = 1;</code>
     */
    public com.example.trendingservice.generatedCode.MovieInfo.Builder getMoviesBuilder(
        int index) {
      return getMoviesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .MovieInfo movies = 1;</code>
     */
    public com.example.trendingservice.generatedCode.MovieInfoOrBuilder getMoviesOrBuilder(
        int index) {
      if (moviesBuilder_ == null) {
        return movies_.get(index);  } else {
        return moviesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .MovieInfo movies = 1;</code>
     */
    public java.util.List<? extends com.example.trendingservice.generatedCode.MovieInfoOrBuilder> 
         getMoviesOrBuilderList() {
      if (moviesBuilder_ != null) {
        return moviesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(movies_);
      }
    }
    /**
     * <code>repeated .MovieInfo movies = 1;</code>
     */
    public com.example.trendingservice.generatedCode.MovieInfo.Builder addMoviesBuilder() {
      return getMoviesFieldBuilder().addBuilder(
          com.example.trendingservice.generatedCode.MovieInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .MovieInfo movies = 1;</code>
     */
    public com.example.trendingservice.generatedCode.MovieInfo.Builder addMoviesBuilder(
        int index) {
      return getMoviesFieldBuilder().addBuilder(
          index, com.example.trendingservice.generatedCode.MovieInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .MovieInfo movies = 1;</code>
     */
    public java.util.List<com.example.trendingservice.generatedCode.MovieInfo.Builder> 
         getMoviesBuilderList() {
      return getMoviesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.trendingservice.generatedCode.MovieInfo, com.example.trendingservice.generatedCode.MovieInfo.Builder, com.example.trendingservice.generatedCode.MovieInfoOrBuilder> 
        getMoviesFieldBuilder() {
      if (moviesBuilder_ == null) {
        moviesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.example.trendingservice.generatedCode.MovieInfo, com.example.trendingservice.generatedCode.MovieInfo.Builder, com.example.trendingservice.generatedCode.MovieInfoOrBuilder>(
                movies_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        movies_ = null;
      }
      return moviesBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:TrendingMoviesResponse)
  }

  // @@protoc_insertion_point(class_scope:TrendingMoviesResponse)
  private static final com.example.trendingservice.generatedCode.TrendingMoviesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.trendingservice.generatedCode.TrendingMoviesResponse();
  }

  public static com.example.trendingservice.generatedCode.TrendingMoviesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TrendingMoviesResponse>
      PARSER = new com.google.protobuf.AbstractParser<TrendingMoviesResponse>() {
    @java.lang.Override
    public TrendingMoviesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<TrendingMoviesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TrendingMoviesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.trendingservice.generatedCode.TrendingMoviesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
