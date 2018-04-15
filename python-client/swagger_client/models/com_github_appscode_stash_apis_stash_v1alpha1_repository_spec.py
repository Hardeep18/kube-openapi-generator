# coding: utf-8

"""
    stash-server

    No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)  # noqa: E501

    OpenAPI spec version: v0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from swagger_client.models.com_github_appscode_stash_apis_stash_v1alpha1_backend import ComGithubAppscodeStashApisStashV1alpha1Backend  # noqa: F401,E501


class ComGithubAppscodeStashApisStashV1alpha1RepositorySpec(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'backend': 'ComGithubAppscodeStashApisStashV1alpha1Backend'
    }

    attribute_map = {
        'backend': 'backend'
    }

    def __init__(self, backend=None):  # noqa: E501
        """ComGithubAppscodeStashApisStashV1alpha1RepositorySpec - a model defined in Swagger"""  # noqa: E501

        self._backend = None
        self.discriminator = None

        if backend is not None:
            self.backend = backend

    @property
    def backend(self):
        """Gets the backend of this ComGithubAppscodeStashApisStashV1alpha1RepositorySpec.  # noqa: E501


        :return: The backend of this ComGithubAppscodeStashApisStashV1alpha1RepositorySpec.  # noqa: E501
        :rtype: ComGithubAppscodeStashApisStashV1alpha1Backend
        """
        return self._backend

    @backend.setter
    def backend(self, backend):
        """Sets the backend of this ComGithubAppscodeStashApisStashV1alpha1RepositorySpec.


        :param backend: The backend of this ComGithubAppscodeStashApisStashV1alpha1RepositorySpec.  # noqa: E501
        :type: ComGithubAppscodeStashApisStashV1alpha1Backend
        """

        self._backend = backend

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, ComGithubAppscodeStashApisStashV1alpha1RepositorySpec):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other